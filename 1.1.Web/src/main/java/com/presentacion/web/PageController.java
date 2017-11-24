package com.presentacion.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String Inicio() {		
		return "Page/Principal";	
	}	
	@RequestMapping(value = "/QuienesSomos", method = RequestMethod.GET)
	public String QuienesSomos() {		
		return "Page/QuienesSomos";	
	}	
	@RequestMapping(value = "/NuestrasCanchas", method = RequestMethod.GET)
	public String NuestrasCanchas() {		
		return "Page/NuestrasCanchas";	
	}
	@RequestMapping(value = "/Contactenos", method = RequestMethod.GET)
	public String Contactenos() {		
		return "Page/Contactenos";	
	}
}
