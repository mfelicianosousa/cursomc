package br.edu.mfs.cursomc.domain;

import java.io.Serializable;
import java.util.ArrayList;
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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="CATEGORIA")
public class Categoria implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="ID")
	private int id ;
	
	@Column(name="NOME", nullable=false)
	private String nome ;
	
	@Column(name="IDPAI", nullable=false)
	private int idpai ;

	@JsonManagedReference
	@ManyToMany(mappedBy="categorias")
	private List<Produto> produtos = new ArrayList<>();
	
	@JsonBackReference
	@ManyToMany
	@JoinTable(name="CATEGORIA_SEGMENTO",
			joinColumns = @JoinColumn(name="ID_CATEGORIA"), 
			inverseJoinColumns =@JoinColumn(name="ID_SEGMENTO")
    )
	private List<Segmento> segmentos = new ArrayList<>();
	
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

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public List<Segmento> getSegmentos() {
		return segmentos;
	}

	public void setSegmentos(List<Segmento> segmentos) {
		this.segmentos = segmentos;
	} ;
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
	}

	
}
