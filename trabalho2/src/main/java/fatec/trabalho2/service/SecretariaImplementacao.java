package fatec.trabalho2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fatec.trabalho2.model.Aluno;
import fatec.trabalho2.model.Aula;
import fatec.trabalho2.repository.AlunoRepository;
import fatec.trabalho2.repository.AulaRepository;

@Service("secretariaService")
public class SecretariaImplementacao implements SecretariaService {

	@Autowired
	private AlunoRepository alunoRepository;
	@Autowired
	private AulaRepository aulaRepository;

	public AulaRepository getAulaRepository() {
		return aulaRepository;
	}

	public void setAulaRepository(AulaRepository aulaRepository) {
		this.aulaRepository = aulaRepository;
	}
	
	public AlunoRepository getalunoRepository() {
		return alunoRepository;
	}

	public void setAlunoRepository(AlunoRepository alunoRepository) {
		this.alunoRepository = alunoRepository;
	}
	
	@Transactional
	public void insereAluno(Aluno aluno) {
		alunoRepository.save(aluno);	
	}
	
	@Transactional
	public void consultaAluno(Long id) {
		Aluno aluno = alunoRepository.findById(id);
		System.out.println(aluno.getNome());
	}
	
	@Transactional
	public void insereAula(Aula aula) {
		aulaRepository.save(aula);
	}

	@Transactional
	public void consultaAula(Long numSala) {
		int a = 1;
		Aula aula = aulaRepository.findByNumSala(numSala);
		System.out.println(aula.getCurso().toUpperCase());
		for(Aluno aluno : aula.getAlunos()){
			System.out.println(a +  "Aluno: " + aluno.getNome().toUpperCase() + "\n");
			System.out.println(" ID: " + aluno.getId() + "\n\n");
			a++;
		}
	}

}
