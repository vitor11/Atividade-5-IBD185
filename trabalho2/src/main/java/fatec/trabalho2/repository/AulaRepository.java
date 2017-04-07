package fatec.trabalho2.repository;


import org.springframework.data.repository.CrudRepository;

import fatec.trabalho2.model.Aula;

	
public interface AulaRepository extends CrudRepository<Aula, Long> {
	public Aula findByNumSala(Long numSala);
}


