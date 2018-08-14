package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aluno")
public class Alunos {
	@Id
	
	private int id_aluno;
	
	@Column
	private String nome;
	
	@Column
	private String endereco;
	
	public int getId_aluno() {
		return id_aluno;
	}
	public void setId_aluno(int id_aluno) {
		this.id_aluno = id_aluno;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEndereco() {
		return id_aluno;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	

}
