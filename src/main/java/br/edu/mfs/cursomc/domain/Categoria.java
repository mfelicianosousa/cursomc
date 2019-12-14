package br.edu.mfs.cursomc.domain;

import java.io.Serializable;

public class Categoria implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int id ;
	private String nome ;
	private int idpai ;
	
	public Categoria() {
		
	}

	public Categoria(int id, String nome, int idpai ) {
		super();
		this.id = id;
		this.nome = nome;
		this.idpai = idpai ;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdpai() {
		return idpai;
	}

	public void setIdpai(int idpai) {
		this.idpai = idpai;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id != other.id)
			return false;
		return true;
	} ;

	
	
}
