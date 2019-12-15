package br.edu.mfs.cursomc.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="PRODUTO")
public class Produto implements Serializable {
	
	/**
	 *   Cadastro de Produto
	 *   Em 14/12/2019
	 *   Por : Marcelino Feliciano de Sousa
	 *   
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="ID", nullable=false)
	private int id ;
	
	@Column(name="NOME", nullable=false)
	private String nome ;
	
	@Column(name="PRECOVENDA")
	private double precoVenda ;
	
	@Column(name="PRECOCOMPRA")
	private double precoCompra ;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATACADASTRO", nullable=true)
	private Calendar dataCadastro ;
	
	
	@JsonBackReference
	@ManyToMany
	@JoinTable(name="PRODUTO_CATEGORIA",
			joinColumns = @JoinColumn(name="ID_PRODUTO"), 
			inverseJoinColumns =@JoinColumn(name="ID_CATEGORIA")
    )
	private List<Categoria> categorias = new ArrayList<>() ;
	
	public Produto() {
		
	}
	
	public Produto(int id, String nome, double precoVenda, double precoCompra) {
		super();
		this.id = id;
		this.nome = nome;
		this.precoVenda = precoVenda;
		this.precoCompra = precoCompra;
	}


	public Produto(int id, String nome, Double precoVenda, Double precoCompra, Calendar dataCadastro) {
		super();
		this.id = id;
		this.nome = nome;
		this.precoVenda = precoVenda;
		this.precoCompra = precoCompra;
		this.dataCadastro = dataCadastro;
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
	public Double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	public Double getPrecoCompra() {
		return precoCompra;
	}
	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}


	public Calendar getDataCadastro() {
		return dataCadastro;
	}



	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
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
		Produto other = (Produto) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}
