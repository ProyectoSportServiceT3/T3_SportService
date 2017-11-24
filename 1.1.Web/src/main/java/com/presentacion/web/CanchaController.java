package com.presentacion.web;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import pojo.Cancha;
import pojo.Usuario;

@Controller
public class CanchaController {
	
	@RequestMapping(value = "/ListarCanchas", method = RequestMethod.GET)
	public ModelAndView listar(HttpServletRequest req) {
		try {
			HttpSession ses = req.getSession();
			if(ses.getAttribute("objusuario")!=null){
				ModelAndView m = new ModelAndView("Cancha/Listar");
				String URI = "http://localhost:8080/rest/Cancha/Listar";
				RestTemplate rest = new RestTemplate();
				ArrayList<Cancha> lista = new ArrayList<Cancha>();
				ArrayList<Cancha> result = rest.getForObject(URI,lista.getClass());
				m.addObject("listita", result);
				return m;
			}else {
				return new ModelAndView("Login/LoginExtranet","command",new Usuario());
			}
			
		} catch (Exception e) {
			return new ModelAndView("frmError", "error", e.getMessage());
		}
		
	}


}
