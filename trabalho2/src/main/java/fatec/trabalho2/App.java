package fatec.trabalho2;

import java.util.LinkedList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fatec.trabalho2.model.Aluno;
import fatec.trabalho2.model.Aula;
import fatec.trabalho2.service.SecretariaService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SecretariaService secretaria = (SecretariaService) context.getBean("secretariaService");
		
		Aluno aluno = new Aluno();
		aluno.setCurso("Banco de Dados");
		aluno.setSala("405");
		aluno.setNome("Michel Ob.");
		
		Aluno aluno2 = new Aluno();
		aluno2.setCurso("Banco de Dados");
		aluno2.setSala("405");
		aluno2.setNome("Ricardo Ol.");
		
		Aluno aluno3 = new Aluno();
		aluno3.setCurso("Banco de Dados");
		aluno3.setSala("405");
		aluno3.setNome("Zé Ng.");
		
		List<Aluno> alunos = new LinkedList<Aluno>();
		alunos.add(aluno);
		alunos.add(aluno2);
		alunos.add(aluno3);
		
		Aula aula = new Aula();
		aula.setAlunos(alunos);
		aula.setCurso("Banco de Dados");
		aula.setNomeProfessor("Mineda");
		aula.setNumSala(405L);
		
		secretaria.insereAluno(aluno);
		secretaria.insereAluno(aluno2);
		secretaria.insereAluno(aluno3);
		
		secretaria.insereAula(aula);
		
		secretaria.consultaAula(405L);
	}

}