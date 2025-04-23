package br.com.liderdb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.liderdb.Model.Usuario;
import br.com.liderdb.Repository.UsuarioRepository;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository ur;
	@Autowired
	private PasswordEncoder passwordEncoder;

	@PostMapping("/addUsuario")
	public String addUsuario(@ModelAttribute("usuario") Usuario usuario) {
		usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
		ur.save(usuario);
		return "home";
	}
}
