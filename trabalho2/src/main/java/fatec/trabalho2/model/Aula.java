package fatec.trabalho2.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "AUL_AULA")
public class Aula {
	
	@Id
	@Column(name = "AUL_NUM_SALA", unique = false, length = 25, nullable = false)
	private Long numSala;

	@Column(name = "AUL_NOME_PROFESSOR", unique = false, length = 25, nullable = false)
	private String nomeProfessor;

	@Column(name = "AUL_CURSO", unique = false, length = 25, nullable = false)
	private String curso;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "AUL_ALN", joinColumns = { @JoinColumn(name = "AUL_NUM_SALA") }, inverseJoinColumns = {
			@JoinColumn(name = "ALN_ID") })
	//private List<Aluno> alunos;
	private List<Aluno> alunos;

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public Long getNumSala() {
		return numSala;
	}

	public void setNumSala(Long numSala) {
		this.numSala = numSala;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
