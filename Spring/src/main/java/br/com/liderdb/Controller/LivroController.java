package br.com.liderdb.Controller;

import java.util.List;
import java.util.Optional;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import br.com.liderdb.Model.Livro;
import br.com.liderdb.Repository.LivroRepository;


@Controller
public class LivroController {
	
	@Autowired
	private LivroRepository livroRepository;

	//metodo de mostrar
	@ResponseBody
	@RequestMapping(path="/livros")
	public List<Livro> listar(){
		List<Livro> livro = livroRepository.findAll();
		return livro;
	}
	
	//metodo de mostrar por id
	@ResponseBody
	@RequestMapping(path="/livros/{isbn}")
	public Optional<Livro> listarId(@PathVariable long isbn){
		Optional<Livro> livro = livroRepository.findById(isbn);
		return livro;
	}
	
	//metodo de inserir
	@ResponseBody
	@Transactional
	@RequestMapping(path="/livros", method = RequestMethod.POST)
	public void salvar(@RequestBody Livro livro) {
		livroRepository.save(livro);
	}

	//metodo de atualizar
	@ResponseBody
	@Transactional
	@RequestMapping(path = "/livros", method = RequestMethod.PUT)
	public void atualizar(@RequestBody Livro livro) {
		livroRepository.save(livro);
	}
	
	//metodo de deletar
	@ResponseBody
	@Transactional
	@RequestMapping(path = "/livros/{isbn}", method = RequestMethod.DELETE)
	public void deletar(@PathVariable Long isbn){
		livroRepository.deleteById(isbn);
	}
}
