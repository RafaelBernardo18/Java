package br.com.liderdb.Ralatorio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"br.com.liderdb.Controller", "br.com.liderdb.Service"})
public class RaltorioApplication {

	public static void main(String[] args) {
		SpringApplication.run(RaltorioApplication.class, args);
	}

}
