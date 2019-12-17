package br.edu.mfs.cursomc.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="MUNICIPIO")
public class Municipio implements Serializable {
	/**
	 * http://www.universidadejava.com.br/materiais/jpa-chave-primaria-composta/
	 */
	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID", nullable=false)
	private int id;
	
	private String codMunicipio ;
	
	private String nome ;
	
	private String ddd ;
	
	private long latitude ;
	
	private long longitude ;
	
	@ManyToOne
	@JoinColumn(name="uf")
	private Estado uf;
	
	public Municipio() {
		
	}

	
	public Municipio(int id, String codMunicipio, String nome, String ddd, long latitude, long longitude, Estado uf) {
		super();
		this.id = id;
		this.codMunicipio = codMunicipio;
		this.nome = nome;
		this.ddd = ddd;
		this.latitude = latitude;
		this.longitude = longitude;
		this.uf = uf;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public long getLatitude() {
		return latitude;
	}

	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}

	public long getLongitude() {
		return longitude;
	}

	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCodMunicipio() {
		return codMunicipio;
	}


	public void setCodMunicipio(String codMunicipio) {
		this.codMunicipio = codMunicipio;
	}


	public Estado getUf() {
		return uf;
	}


	public void setUf(Estado uf) {
		this.uf = uf;
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
		Municipio other = (Municipio) obj;
		if (id != other.id)
			return false;
		return true;
	}

		
	
	
}
