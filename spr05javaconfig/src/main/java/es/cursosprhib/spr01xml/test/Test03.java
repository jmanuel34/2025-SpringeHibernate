package es.cursosprhib.spr01xml.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import config.A03Config;
import es.cursosprhib.spr01xml.servicios.ServicioConAccesoADatos;

public class Test03 {

	public static void main(String[] args) {
		BeanFactory ctx = new  AnnotationConfigApplicationContext(A03Config.class);
		ServicioConAccesoADatos scio = ctx.getBean(ServicioConAccesoADatos.class);
		scio.realizaConsulta();
	}

}
