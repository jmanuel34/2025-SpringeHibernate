package es.cursosprhib.mediosdepago.aspectos;

import org.aspectj.lang.annotation.Pointcut;

public class PointCut {
//	@Pointcut("within(es.cursosprhib.mediosdepago.persistencia..*) or ...  ")
	@Pointcut("within(es.cursosprhib.mediosdepago.persistencia..*)")
	public void enPersistencia() {}
	
	
	@Pointcut("within(es.cursosprhib.mediosdepago.servicio..*)")
	public void enServicio() {}
	
	public final static String SERVICIO="es.cursosprhib.mediosdepago.aspectos.PointCut.enServicio()";
}
