package escola.musica.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tab_curso")
public class Curso {
     
	@Id
	@GeneratedValue
	private int id;
	private String nome, descricao;
	double duracao = 1;
	private TipoCurso tipo;
	private Date dataCriacao;

	public Curso(Integer id, String nome, String descricao, double duracao,
			TipoCurso tipo, Date dataCriacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.duracao = duracao;
		this.tipo = tipo;
		this.dataCriacao = dataCriacao;
	}

	public Curso() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public TipoCurso getTipo() {
		return tipo;
	}

	public void setTipo(TipoCurso tipo) {
		this.tipo = tipo;
	}

}
