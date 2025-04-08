package br.com.liderdb.Bebidas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages= {"br.com.liderdb.Model"})
@EnableJpaRepositories(basePackages = {"br.com.liderdb.Repository"})
@ComponentScan(basePackages= {"br.com.liderdb.Controller", "br.com.liderdb.Service"})
public class BebidasApplication {

	public static void main(String[] args) {
		SpringApplication.run(BebidasApplication.class, args);
	}
	
}
