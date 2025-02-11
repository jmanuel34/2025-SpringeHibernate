package es.cursosprhib.medidosdepago.persistencia;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.cursosprhib.mediosdepago.config.PersistenciaConfig;
import es.cursosprhib.mediosdepago.persistencia.ClienteDao;
import es.cursosprhib.mediosdepago.persistencia.CuentaDao;

@SpringBootTest(classes = PersistenciaConfig.class)
class P01mdpPersistenciaSdataApplicationTests {
	
	@Autowired
	ClienteDao cliDao;
	@Autowired
	CuentaDao ctaDao;
	
	@Test
	void contextLoads() {
//		System.out.println(cliDao.findById(261));
//		System.out.println(ctaDao.findById(47));
//		System.out.println("Buscar por nif");
//		System.out.println(cliDao.findByNif("93107230X"));
//		cliDao.findByNombre("pe").forEach(System.out::println);
		cliDao.findByIdEager(73).getCuentas();
		System.out.println(cliDao.findById(73).get().getCuentas());
		System.out.println(cliDao.getClientesMapNif());
	}

}
