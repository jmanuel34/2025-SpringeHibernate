package es.cursosprhib.mediosdepago.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan("es.cursosprhib.mediosdepago.servicio")
@Import(PersistenciaConfig.class)

public class ServicioConfig {

}
