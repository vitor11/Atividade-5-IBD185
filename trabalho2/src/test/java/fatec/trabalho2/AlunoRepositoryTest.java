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

import fatec.trabalho2.model.Aluno;
import fatec.trabalho2.model.Aula;
import fatec.trabalho2.repository.AlunoRepository;
import fatec.trabalho2.service.SecretariaService;

	
/**
 * @author Vitor
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/applicationContext.xml" })
@Rollback
@Transactional
public class AlunoRepositoryTest extends AbstractTransactionalJUnit4SpringContextTests {
	
	private static final String NOME = "ALBERTO";
	private static final String CURSO = "ADS";
	private static final String SALA = "405";
	
	@Autowired
	private AlunoRepository alunoRepo;
	
	
	/**
	 * @param alunoRepo the alunoRepo to set
	 */
		public void setAlunoRepo(AlunoRepository alunoRepo) {
			this.alunoRepo = alunoRepo;
		}
		
	
		
	
		@Test
		public void testeInsercaoOk() {
			Aluno aluno = new Aluno();
			aluno.setNome(NOME);
			aluno.setCurso(CURSO);
			aluno.setSala(SALA);
			alunoRepo.save(aluno);
			assertTrue(aluno.getId() != null);
		}
		
		
	
	}


