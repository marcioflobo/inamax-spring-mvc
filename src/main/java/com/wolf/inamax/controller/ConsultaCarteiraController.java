package com.wolf.inamax.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wolf.inamax.repository.Ocorrencias;

@Controller
public class ConsultaCarteiraController {
	
	private static final String COLSULTA_CARTEIRA_VIEW = "carteira/ConsultaCarteira";
	
	@Autowired
	private Ocorrencias ocorrencias;
	
	@RequestMapping("/consulta/carteira")
	public ModelAndView novo() {
		ModelAndView mv = new ModelAndView(COLSULTA_CARTEIRA_VIEW);
		mv.addObject("ocorrencias", ocorrencias.findAll());
		return mv;
	}
}
