package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.reactive.config.CorsRegistry;

import com.example.demo.service.IexamenService;



@Configuration
@CrossOrigin
@Controller	
public class onpe {
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**");
	}
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@Autowired
	private IexamenService iexamen;
	
	@RequestMapping("/resumen")
	public String resumen(Model modelo){
		modelo.addAttribute("resumenes", iexamen.getExamen());
	    return "resumen";
	}
}
