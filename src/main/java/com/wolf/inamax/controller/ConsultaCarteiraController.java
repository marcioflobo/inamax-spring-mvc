package com.wolf.inamax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConsultaCarteiraController {

	@RequestMapping("/consulta/carteira")
	public String novo() {
		return "carteira/ConsultaCarteira";
	}
}
