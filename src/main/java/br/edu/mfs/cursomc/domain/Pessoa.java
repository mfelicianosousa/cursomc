package br.edu.mfs.cursomc.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Pessoa implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="ID", nullable=false)
	private int id ;
	@Column(name="NOME",length=30)
	private String nome;
	@Column(name="SOBRENOME",length=70)
	private String sobrenome;
	private Date dataNascimento;
	@Column(name="SEXO",length=1)
	private String sexo;
	@Column(name="CPF",length=11)
    private String cpf;
	@Column(name="RGNUMERO",length=20)
    private String rgNumero;
	@Column(name="RGORGAOEMISSOR",length=10)
    private String rgOrgaoEmissor ;
	@Column(name="RGUFEMISSOR",length=2)
    private String rgEstadoEmissor ;
    private Date   rgDataEmissao;
    @Column(name="DDD",length=3)
    private String ddd;
    @Column(name="TELEFONE",length=10)
    private String telefone;
    @Column(name="CELULAR",length=10)
    private String celular;
    @Column(name="EMAIL",length=100)
    private String email;
    @Column(name="ENDERECO",length=100)
    private String endereco;
    @Column(name="PROFISSAO",length=40)
    private String profissao;
    
    private Pessoa() {
   
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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRgNumero() {
		return rgNumero;
	}

	public void setRgNumero(String rgNumero) {
		this.rgNumero = rgNumero;
	}

	public String getRgOrgaoEmissor() {
		return rgOrgaoEmissor;
	}

	public void setRgOrgaoEmissor(String rgOrgaoEmissor) {
		this.rgOrgaoEmissor = rgOrgaoEmissor;
	}

	public String getRgEstadoEmissor() {
		return rgEstadoEmissor;
	}

	public void setRgEstadoEmissor(String rgEstadoEmissor) {
		this.rgEstadoEmissor = rgEstadoEmissor;
	}

	public Date getRgDataEmissao() {
		return rgDataEmissao;
	}

	public void setRgDataEmissao(Date rgDataEmissao) {
		this.rgDataEmissao = rgDataEmissao;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
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
		Pessoa other = (Pessoa) obj;
		if (id != other.id)
			return false;
		return true;
	}
    
    
}
