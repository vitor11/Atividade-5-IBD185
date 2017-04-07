/**
 * 
 */
package fatec.trabalho2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import fatec.trabalho2.model.Aula;
import fatec.trabalho2.service.SecretariaService;
	
/**
 * @author Vitor
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/applicationContext.xml" })
@Rollback
@Transactional

public class ServiceSecretariaTest extends AbstractTransactionalJUnit4SpringContextTests {
	
	@Autowired
	private  SecretariaService secreService;
	
	/**
	 * @param secreService the secreService to set
	 */
	public void setSecretariaService(SecretariaService secreService) {
		this.secreService = secreService;
	}
		
	@Test
	public void testeService()	{
		Aula aula1 = new Aula();
		aula1.setNumSala(500L);
		aula1.setNomeProfessor("JHONY");
		aula1.setCurso("LOGISTICA");
		try{
			secreService.insereAula(aula1);
			secreService.consultaAula(405L);
			assertTrue(true);
		}catch(Exception e){
			assertTrue(false);
		}
	}
}
