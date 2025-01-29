package es.cursosprhib.spr01xml.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.cursosprhib.spr01xml.servicios.ServicioConAccesoADatos;

public class Test03 {

	public static void main(String[] args) {
		BeanFactory ctx = new ClassPathXmlApplicationContext("a03appcontext.xml");
		ServicioConAccesoADatos scio = ctx.getBean(ServicioConAccesoADatos.class);
		scio.realizaConsulta();
	}

}
