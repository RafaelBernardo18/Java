package br.com.liderdb.Controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Controller;

import br.com.liderdb.Model.Cupom;
import br.com.liderdb.Service.CupomImpl;

@Controller
public class CupomController {
	
	//objeto composto
	private CupomImpl ci;
	
	//construtor
	public CupomController (CupomImpl ci) {
		this.ci = ci;
	}
	
	@GetMapping(path="/")
	public String index(Cupom cupom) {;
		return "index";
	}
	
	//metodo de requisição para gerar o relatorio
	@PostMapping("/gerar-cupom")
	public String gerar(Cupom cupom) {
		try {
			this.ci.gerar(cupom);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "redirect:/";
	}
}
