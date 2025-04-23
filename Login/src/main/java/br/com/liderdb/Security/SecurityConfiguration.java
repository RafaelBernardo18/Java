package br.com.liderdb.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.security.web.SecurityFilterChain;

import br.com.liderdb.Service.UsuarioService;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

	@Autowired
	private UsuarioService us;
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
		String[] staticResources = {
	            "/static/**"};
		
		httpSecurity
				.csrf(httpSecurityCsrfConfigurer -> httpSecurityCsrfConfigurer.disable()) //desabilita proteção contra inserção ou alteração de dados
				.authorizeHttpRequests(registry -> {
						registry.requestMatchers("/", "/cadastrar", "/addUsuario").permitAll(); //rotas permitidas independedete de login
						registry.requestMatchers("/admin/**").hasRole("ADMIN"); //rotas permitidas com a delegação ADMIN
						registry.requestMatchers("/guest/**").hasRole("GUEST"); // rotas permitidas com a delegação GUEST
						registry.requestMatchers(staticResources).permitAll();
						registry.anyRequest().authenticated();})
				.formLogin(httpSecurityFormLoginConfigurer -> {
					httpSecurityFormLoginConfigurer.loginPage("/login").permitAll(); //rota de login
					 })
				.logout(logout -> logout 
						.logoutUrl("/logout") //rota pra fechar a secao criada
		 				.logoutSuccessUrl("/") //rota executada apos a fechar a secao
		 				);
				return httpSecurity.build();
	}
	
	@Bean
	public UserDetailsService userDetailsService() {
		return us;
	}
		
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider provider  = new DaoAuthenticationProvider();
		provider.setUserDetailsService(us);
		provider.setPasswordEncoder(passwordEncoder());
		return provider;
	}
}
