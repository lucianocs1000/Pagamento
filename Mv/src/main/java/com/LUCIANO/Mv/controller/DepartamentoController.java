package com.LUCIANO.Mv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/departamentos")
public class DepartamentoController {
	
	@GetMapping(value = "/cadastrar")
	public String Cadastrar() {
		
		return "/departamento/cadastro";
	}
	
	@GetMapping(value = "listar")
	public String Listar() {
		return "/departamento/lista";
	}
	

}
