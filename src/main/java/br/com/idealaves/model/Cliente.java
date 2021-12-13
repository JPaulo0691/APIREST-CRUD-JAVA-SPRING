package br.com.idealaves.model;

import javax.persistence.*;

@Entity

public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;	
	private String nome;
	private String bairro;
	
	public Cliente() {
		
	}
	
	public Cliente(Long id, String nome, String bairro) {
		this.id = id;
		this.nome = nome;
		this.bairro = bairro;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
}
