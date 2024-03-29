package br.edu.mfs.cursomc.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import br.edu.mfs.cursomc.domain.enums.Regiao;

@Entity
@Table(name="ESTADO")
public class Estado implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="UF", length=2, nullable=false)
	private String uf;

	@Column(name="CODESTADO",length=2, nullable=true)
	private String codEstado ;
	
	@Column(name="NOME",length=50, nullable=true)
	private String nome ;

	@Column(name="CAPITAL", length=40, nullable=false)
	private String capital ;
	
	@Column(name="REGIAO", nullable=false)
	private int regiao ; /* {Norte, Nordeste, Sul, Sudeste, Centro-Oeste } */
	
	@JsonBackReference
	@OneToMany(mappedBy="uf")
	private List<Municipio> municipio = new ArrayList<>();
	
	
	public Estado () {
		
	}
		
	public Estado(String uf, String codEstado, String nome, String capital, Regiao regiao) {
		super();
		this.uf = uf;
		this.codEstado = codEstado;
		this.nome = nome;
		this.capital = capital;
		this.regiao = regiao.getCodigo();
	}


	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public List<Municipio> getMunicipio() {
		return municipio;
	}

	public void setMunicipio(List<Municipio> municipio) {
		this.municipio = municipio;
	}

	
	public String getCodEstado() {
		return codEstado;
	}
	public void setCodEstado(String codEstado) {
		this.codEstado = codEstado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public Regiao getRegiao() {
		return Regiao.toEnum(regiao);
	}
	public void setRegiao(Regiao regiao) {
		this.regiao = regiao.getCodigo();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uf == null) ? 0 : uf.hashCode());
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
		Estado other = (Estado) obj;
		if (uf == null) {
			if (other.uf != null)
				return false;
		} else if (!uf.equals(other.uf))
			return false;
		return true;
	}
	
	
	
	
	

}
