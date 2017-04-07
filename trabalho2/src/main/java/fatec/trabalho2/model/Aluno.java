package fatec.trabalho2.model;

import java.util.HashSet;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "ALN_ALUNO")
public class Aluno {
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name = "ALN_ID")
	private Long id;

	@Column(name = "ALN_NOME", unique = false, length = 20, nullable = false)
	private String nome;

	@Column(name = "ALN_CURSO", unique = false, length = 25, nullable = false)
	private String curso;

	@Column(name = "ALN_SALA", unique = false, length = 2, nullable = false)
	private String sala;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "AUL_ALN", joinColumns = { @JoinColumn(name = "ALN_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "AUL_NUM_SALA") })
	private List<Aula> aula;

	public List<Aula> getAula() {
		return aula;
	}

	public void setAula(List<Aula> aula) {
		this.aula = aula;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public void setAulas(List<Aula> aula) {
		this.aula = aula;
	}
}