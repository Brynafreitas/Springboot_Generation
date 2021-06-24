package br.com.generation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello2")
public class HelloWorld2 {
	
	@GetMapping
	public String hello() {
		
		return ("<h1 style=\"text-align:center\">Objetivos de aprendizagem</h1> "
				+"<h2 style=\"text-align:center\">Conhecimento, aprender o springboot, entender os metodos"
		 		+ " aprimorar a lógica de programação.</h2>");
		
	}
	

}
