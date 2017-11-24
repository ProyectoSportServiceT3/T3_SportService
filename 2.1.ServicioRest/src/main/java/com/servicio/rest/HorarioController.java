package com.servicio.rest;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.datos.OPR.HorarioDAO;
import com.entidades.OPR.Horario;

@Controller
public class HorarioController {
	@RequestMapping(value = "/Horario/Listar", method = RequestMethod.GET, 
			produces ="application/json")
	public @ResponseBody ArrayList<Horario> Listar(int idCancha) {
		ArrayList<Horario> obj = null; 
		try {
			obj = HorarioDAO.Instancia().Listar(idCancha);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}

}
