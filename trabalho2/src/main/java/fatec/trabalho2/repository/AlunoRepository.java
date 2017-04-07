package fatec.trabalho2.repository;

import org.springframework.data.repository.CrudRepository;

import fatec.trabalho2.model.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, Long> {
		
	public Aluno findById(Long id);
	
}
