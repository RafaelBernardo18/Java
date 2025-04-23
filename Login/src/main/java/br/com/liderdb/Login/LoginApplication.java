package br.com.liderdb.Login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages= {"br.com.liderdb.Model"})
@EnableJpaRepositories(basePackages = {"br.com.liderdb.Repository"})
@ComponentScan(basePackages= {"br.com.liderdb.Controller", "br.com.liderdb.Service", "br.com.liderdb.Security"})
public class LoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginApplication.class, args);
	}

}
