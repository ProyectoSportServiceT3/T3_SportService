package com.presentacion.web;



import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import pojo.Usuario;

@Controller
public class HomeController {
	@RequestMapping(value = "/Login", method = RequestMethod.GET)
	public ModelAndView home() {		
		return new ModelAndView("Login/LoginExtranet", "command", new Usuario());	
	}

	@RequestMapping(value = "/VerificarAcceso", method = RequestMethod.POST)
	public String VerificarAcceso(@ModelAttribute("SpringWeb")Usuario u, 
						HttpServletRequest req, ModelMap model) {		
		try {
			String Usuario = u.getName();
			String Password = u.getContrasenia();
			RestTemplate rest = new RestTemplate();
			String URI = 
				"http://localhost:8080/rest/Usuario/VerificarAcceso" + 
						"?USuario="+Usuario+"&Password="+Password;
			Usuario result = rest.getForObject(URI, u.getClass());
			if(result!=null) {
				req.getSession().setAttribute("objusuario", result);
				return "redirect:/";				
			}else {
				return "redirect:/Login?msg=Usuario o password no valido";
			}			
		} catch (Exception e) {
			return "error";
		}	
	}
	@RequestMapping(value = "/Nuevo", method = RequestMethod.GET)
	public ModelAndView CrearUsuario() {		
		return new ModelAndView("CrearUsuario", "command", new Usuario());	
	}
	@RequestMapping(value = "/UsuarioNuevo", method = RequestMethod.POST)
	public String CrearUsuario(@ModelAttribute("SpringWeb")Usuario u, 
			HttpServletRequest req, ModelMap model) {		
		try {
			Usuario usu = new Usuario();
			RestTemplate rest = new RestTemplate();
			String URI = 
				"http://localhost:8080/rest/Usuario/Nuevo?" + 
						"&Name=" + u.getName()+
						"&Contrasenia="  + u.getContrasenia()+
						"&Telefono=" + u.getTelefono()+
						"&Apellido=" + u.getApellido();
			Usuario result = rest.getForObject(URI, usu.getClass());
			if(result!=null) {
				return "MenuPrincipal";				
			}else {
				return "redirect:/?msg=Usuario o password no valido";
			}			
		} catch (Exception e) {
			return "error";
		}	
	}
	
}