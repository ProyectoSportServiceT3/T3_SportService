package com.presentacion.web;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import pojo.Horario;

@Controller
public class HorarioController {
	@RequestMapping(value = "/HorariodeCancha", method = RequestMethod.GET)
	public ModelAndView listar(@RequestParam("id")String id) {
		try {
			ModelAndView m = new ModelAndView("Cancha/Horario");
			String URI = "http://localhost:8080/rest/Horario/Listar?idCancha="+id;
			RestTemplate rest = new RestTemplate();
			ArrayList<Horario> lista = new ArrayList<Horario>();
			ArrayList<Horario> result = rest.getForObject(URI,lista.getClass());
			m.addObject("listita", result);
			return m;			
		} catch (Exception e) {
			return new ModelAndView("frmError", "error", e.getMessage());
		}
	}

}


