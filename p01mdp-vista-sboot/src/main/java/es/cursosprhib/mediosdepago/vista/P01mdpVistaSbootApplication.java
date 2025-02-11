package es.cursosprhib.mediosdepago.vista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import es.cursosprhib.mediosdepago.config.ServicioConfig;

@SpringBootApplication
@Import(ServicioConfig.class)
public class P01mdpVistaSbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(P01mdpVistaSbootApplication.class, args);
	}

}
