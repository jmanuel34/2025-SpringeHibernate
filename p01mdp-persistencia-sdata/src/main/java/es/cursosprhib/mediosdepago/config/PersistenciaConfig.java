package es.cursosprhib.mediosdepago.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Configuration
@EntityScan("es.cursosprhib.mediosdepago.modelo")
@EnableJpaRepositories(repositoryImplementationPostfix = "Impl", 
					basePackages = "es.cursosprhib.mediosdepago.persistencia")
public class PersistenciaConfig {

}
