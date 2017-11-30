package com.presentacion.web;

import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import pojo.Cancha;
import pojo.Cliente;
import pojo.DetalleReserva;
import pojo.Horario;
import pojo.Reserva;
import pojo.Usuario;

@Controller
public class DetalleReservaController {
	@RequestMapping(value = "/AgregarCarrito", method = RequestMethod.GET)
	public String listar(@RequestParam("id")String id,HttpServletRequest req, ModelMap model) {
		try {
			boolean br = true;
			int idd = Integer.parseInt(id);
			ArrayList<DetalleReserva> detalles= new ArrayList<DetalleReserva>();
			Horario claseMolde = new Horario();
			Cancha claseMolde2 = new Cancha();
			HttpSession ses = req.getSession();
			if(ses.getAttribute("objusuario")!=null){
				if(ses.getAttribute("DetalleReserva")!=null){
					detalles= (ArrayList<DetalleReserva>)ses.getAttribute("DetalleReserva");
				}
				for (DetalleReserva detalleReserva : detalles) {
					if(idd==detalleReserva.getHorario().getIdHorario()) {
						br=false;
						break;
					}
				}
				if(br) {
					int idCancha = (Integer)ses.getAttribute("idCancha");
					String URIObtenerHorario = "http://localhost:8080/rest/Horario/Obtener?idHorario="+id;
					String URIObtenercancha = "http://localhost:8080/rest/Cancha/Obtener?idCancha="+idCancha;
					RestTemplate rest = new RestTemplate();
					Horario result = rest.getForObject(URIObtenerHorario,claseMolde.getClass());
					Cancha result2 = rest.getForObject(URIObtenercancha,claseMolde2.getClass());
					DetalleReserva dr = new DetalleReserva();
					dr.setHorario(result);
					dr.getHorario().setCancha(result2);
					dr.setSemana((Integer)ses.getAttribute("weekday"));
					detalles.add(dr);
					req.getSession().setAttribute("DetalleReserva", detalles);
				}
				return "redirect:/";
			}else {
				return "redirect:/Login";
			}
		} catch (Exception e) {
			return "redirect:/";
		}
	}
	
	@RequestMapping(value = "/VerCarrito", method = RequestMethod.GET)
	public ModelAndView listar(HttpServletRequest req, ModelMap model) {
		try {
			
			HttpSession ses = req.getSession();
			if(ses.getAttribute("objusuario")!=null){
				ArrayList<DetalleReserva> detalles= new ArrayList<DetalleReserva>();
				if(ses.getAttribute("DetalleReserva")!=null){
					detalles= (ArrayList<DetalleReserva>)ses.getAttribute("DetalleReserva");
				}
				ModelAndView vista = new ModelAndView("Carrito/Lista");
				vista.addObject("listita", detalles);
				return vista;
			}else {
				return new ModelAndView("Login/LoginExtranet","command",new Usuario());
			}
		} catch (Exception e) {
			return new ModelAndView("Page/Principal");
		}
	}
	
	@RequestMapping(value = "/GuardarCarrito", method = RequestMethod.GET)
	public ModelAndView Guardar(HttpServletRequest req, ModelMap model) {
		try {
			boolean insert = false;
			HttpSession ses = req.getSession();
			if(ses.getAttribute("objusuario")!=null){
				if(ses.getAttribute("DetalleReserva")!=null){
					Usuario u = (Usuario)ses.getAttribute("objusuario");
					Reserva rs= new Reserva();
					Cliente cliente = new Cliente();
					cliente.setIdCliente(u.getIdUsuario());
					rs.setCliente(cliente);
					rs.setDescripcion("Venta");
					rs.setUsuario(u);
					ArrayList<DetalleReserva> detalles= new ArrayList<DetalleReserva>();
					detalles= (ArrayList<DetalleReserva>)ses.getAttribute("DetalleReserva");
					rs.setDetalles(detalles);
					String URI = "http://localhost:8080/rest/Reserva/Guardar?cadXML="+ReservatoXML(rs);
					RestTemplate rest = new RestTemplate();
					Reserva resv = new Reserva();
					Reserva  result = rest.getForObject(URI,resv.getClass());
					if(result.getIdReserva()>0) {
						insert=true;
						req.getSession().setAttribute("DetalleReserva", new ArrayList<DetalleReserva>());
					}
				}
				ModelAndView vista;
				if(insert)
					vista = new ModelAndView("Carrito/Correcto");
				else
					vista = new ModelAndView("Carrito/Error");
				return vista;
			}else {
				return new ModelAndView("Login/LoginExtranet","command",new Usuario());
			}
		} catch (Exception e) {
			return new ModelAndView("Page/Principal");
		}
	}
	public String ReservatoXML(Reserva rs) {
		String cadXml = "<root>";
        cadXml += "<reserva ";
        cadXml += "idCliente*'" + rs.getCliente().getIdCliente() + "' ";
        cadXml += "idUsuario*'" + rs.getUsuario().getIdUsuario() + "' ";
        cadXml += "Descripcion*'" + rs.getDescripcion() + "' >";
            for (DetalleReserva d : rs.getDetalles()) {
                cadXml += "<dreserva ";
                cadXml += "idHorario*'" + d.getHorario().getIdHorario() + "' ";
                cadXml += "Dia*'" + d.getHorario().getDia() + "' ";
                cadXml += "Precio*'" + d.getHorario().getPrecio() + "' ";
                cadXml += "Semana*'" + d.getSemana() + "' />";
            }
        cadXml += "</reserva></root>";
		return cadXml;
	}
}
