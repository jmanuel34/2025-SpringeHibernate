package es.cursosprhib.p01mdp.inicio;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.cursosprhib.p01mdp.config.AppConfig;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		new AnnotationConfigApplicationContext(AppConfig.class);
	}
}
