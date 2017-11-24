package com.servicio.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.datos.seguridad.UsuarioDAO;
import com.entidades.seguridad.Usuario;

@Controller
public class UsuarioController {
	@RequestMapping(value = "/Usuario/VerificarAcceso", method = RequestMethod.GET, 
														produces ="application/json")
	public @ResponseBody Usuario VerificarAcceso(String USuario, 
				    							String Password) {
			Usuario u = null;
			try {
				u = UsuarioDAO.Instancia().VerificarAcceso(USuario, Password);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return u;
	}
	@RequestMapping(value = "/Usuario/Nuevo", method = RequestMethod.GET, 
			produces ="application/json")
	public @ResponseBody Usuario InsertarUsuario(String Name, String Contrasenia, String Telefono, String Apellido) {
		Boolean inserto = false;
		try {
			Usuario u = new Usuario();
			u.setName(Name);
			u.setContrasenia(Contrasenia);
			u.setTelefono(Telefono);
			u.setApellido(Apellido);
			inserto = UsuarioDAO.Instancia().InsertarUsuario(u);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(inserto) {
			return new Usuario();
		}
		else return null;
		
	}
}
