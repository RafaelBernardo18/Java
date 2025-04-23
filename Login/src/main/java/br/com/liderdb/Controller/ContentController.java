package br.com.liderdb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContentController {

	@GetMapping(path="/")
	public String home() {
		return "home";
	}
	
	@GetMapping(path="/login")
	public String login() {
		return "login";
	}
	
	@GetMapping(path="/admin/home")
	public String paginaAdmin() {
		return "admin";
	}
	
	@GetMapping(path="/guest/home")
	public String paginaGuest() {
		return "guest";
	}
	
	@GetMapping(path="/cadastrar")
	public String cadastrar() {
		return "cadastrar";
	}
}
