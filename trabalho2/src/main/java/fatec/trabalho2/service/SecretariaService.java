package fatec.trabalho2.service;

import fatec.trabalho2.model.Aluno;
import fatec.trabalho2.model.Aula;

public interface SecretariaService {
	
	public void insereAluno(Aluno aluno);
	public void consultaAluno(Long id);
	public void insereAula(Aula aula);
	public void consultaAula(Long numSala);
	//public void exemploTransacao();
}
