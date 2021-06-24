package br.com.generation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello1")
public class HelloWorld {
	
 @GetMapping
 public String hello() {
	 return ("<h1 style=\"text-align:center\">Hello World</h1> "
	 		+ "<h2 style=\"text-align:center\">Persitência, Mentalidade de crescimento,"
	 		+ " atenção aos detalhes.</h2>");
			 
	
 }

}
