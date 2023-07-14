package br.com.claro.carga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"br.com.claro.persistence","br.com.claro.carga"})
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class);
	}
}
