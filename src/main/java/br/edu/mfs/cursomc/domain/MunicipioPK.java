package br.edu.mfs.cursomc.domain;

import java.io.Serializable;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class MunicipioPK implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String codMunicipio;
	
	@ManyToOne
	@JoinColumn(name="uf")
	private Estado uf;
	public String getCodMunicipio() {
		return codMunicipio;
	}
	public void setCodMunicipio(String codMunicipio) {
		this.codMunicipio = codMunicipio;
	}
	public Estado getUF() {
		return uf;
	}
	public void setUF(Estado uf) {
		this.uf = uf;
	}
	  
	
	  
}
