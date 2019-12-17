package br.edu.mfs.cursomc.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.edu.mfs.cursomc.domain.enums.TipoEndereco;

@Entity
public class ClienteEndereco implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="ID", nullable=false)
	private int id ;
	private int tipoEndereco ; /*Residencial, Comercial, Local de Entrega*/
	private String cep ;
	private String logradouro ;
	private String numero ;
	private String bairro ;
	private String complemento ;
    
	@ManyToOne
	@JoinColumn(name="id_Cliente") 
	private Cliente cliente ;
	
	@ManyToOne
	@JoinColumn(name="id_Municipio")
	private Municipio municipio ;
   
	  
	public ClienteEndereco() {
	   
	}

	public ClienteEndereco(int id, TipoEndereco tipoEndereco, String cep, String logradouro, String numero,
			String bairro, String complemento, Cliente cliente, Municipio municipio) {
		super();
		this.id = id;
		this.tipoEndereco = tipoEndereco.getCodigo();
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cliente = cliente;
		this.setMunicipio(municipio) ;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public TipoEndereco getTipoEndereco() {
		return TipoEndereco.toEnum(tipoEndereco);
	}
	
	public void setTipoEndereco(TipoEndereco tipoEndereco) {
		this.tipoEndereco = tipoEndereco.getCodigo() ;
	
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
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
		ClienteEndereco other = (ClienteEndereco) obj;
		if (id != other.id)
			return false;
		return true;
	}
	   
	   
}
