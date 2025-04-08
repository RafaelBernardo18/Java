package br.com.liderdb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.liderdb.Service.CervejaService;
import br.com.liderdb.Model.Cerveja;

@Controller
public class CervejaController {

	@Autowired
	private CervejaService cs;
	
	//pagina de index
	@GetMapping(path="/")
	public String index(Model model) {
		model.addAttribute("listaCervejas", cs.ListarCervejas());
		return "index.html";
	}
	
	//navegacao
	@GetMapping(path="/FomularioAddCerveja")
	public String formularioAddCerveja(Model model) {
		Cerveja cerveja = new Cerveja();
		model.addAttribute("cerveja", cerveja);
		return "add.html";
	}
	
	//navegacao
	@GetMapping(path="/FormularioEditCerveja/{id}")
	public String formularioEditCerveja(@PathVariable(value = "id") long id, Model model) {
		Cerveja cerveja = cs.ListarCervejaId(id);
		model.addAttribute("cerveja", cerveja);
		return "edit.html";
	}
	
	//adicionar
	@PostMapping(path="/addCerveja")
	public String addCerveja(@ModelAttribute("cerveja") Cerveja cerveja) {
		cs.SalvarCerveja(cerveja);
		return "redirect:/";
	}
	
	//excluir
    @GetMapping(path="/delCerveja/{id}")
    public String delCerveja(@PathVariable(value = "id") long id) {
        this.cs.DeletarCervejaId(id);
        return "redirect:/";
    }
    
    
}