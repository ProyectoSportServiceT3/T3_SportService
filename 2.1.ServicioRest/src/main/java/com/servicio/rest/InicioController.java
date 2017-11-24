package com.servicio.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InicioController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String Inicio () {	
		return "inicio";
	}
}
