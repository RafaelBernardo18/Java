package br.com.liderdb.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.liderdb.Model.Usuario;
import br.com.liderdb.Repository.UsuarioRepository;

@Service
public class UsuarioService implements UserDetailsService {

	@Autowired
	private UsuarioRepository ur;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Optional<Usuario> usuario = ur.findByEmail(email);
		if(usuario.isPresent()) {
			var obj = usuario.get();
			return User.builder()
					.username(obj.getEmail())
					.password(obj.getSenha())
					.roles(getRoles(obj))
					.build();
		}else {
			throw new UsernameNotFoundException(email);
		} 
	}
	
	private String[] getRoles(Usuario usuario) {
		if(usuario.getRole() == null) {
			return new String[]{"GUEST"};
		} 
		return usuario.getRole().split(",");
	}

}
