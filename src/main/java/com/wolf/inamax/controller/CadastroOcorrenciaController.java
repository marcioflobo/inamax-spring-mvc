package com.wolf.inamax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wolf.inamax.model.Ocorrencia;

@Controller
public class CadastroOcorrenciaController {

	@RequestMapping("/cadastro/ocorrencia")
	public ModelAndView novo(Ocorrencia ocorrencia) {
		ModelAndView mv = new ModelAndView("ocorrencia/CadastroOcorrencia");
		return mv;
	}
}
