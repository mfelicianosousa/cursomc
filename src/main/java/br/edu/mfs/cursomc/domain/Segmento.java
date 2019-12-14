package br.edu.mfs.cursomc.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/*
 * Class : Segmento
 * Em 14/12/2019
 * Objetivo : Identificar o segmento ao qual a Loja está enquadrada
 * CNAE PRINCIPAL 
 * 
 * */
@Entity
public class Segmento implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	private String nome ;
	private String cnae ;
	
	public Segmento() {
		
	}
	
	public Segmento(int id, String nome, String cnae) {
		super();
		this.id = id;
		this.nome = nome;
		this.cnae = cnae;
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
	
	

	public String getCnae() {
		return cnae;
	}

	public void setCnae(String cnae) {
		this.cnae = cnae;
	}

	
	@Override
	public String toString() {
		return "Segmento [id=" + id + ", nome=" + nome + ", cnab=" + cnae + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Segmento other = (Segmento) obj;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	

}
