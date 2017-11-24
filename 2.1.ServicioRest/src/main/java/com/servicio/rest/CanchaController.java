package com.servicio.rest;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.datos.OPR.CanchaDAO;
import com.entidades.OPR.Cancha;

@Controller
public class CanchaController {
	
	@RequestMapping(value = "/Cancha/Listar", method = RequestMethod.GET, 
			produces ="application/json")
	public @ResponseBody ArrayList<Cancha> Listar() {
		ArrayList<Cancha> obj = null; 
		try {
			obj = CanchaDAO.Instancia().Listar();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}


}
