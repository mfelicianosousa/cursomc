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

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="MUNICIPIO")
public class Municipio implements Serializable {
	/**
	 * http://www.universidadejava.com.br/materiais/jpa-chave-primaria-composta/
	 * *Table structure for table `city` 

		CREATE TABLE `city` (
		  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
		  `id_state` int(11) NOT NULL COMMENT 'State',
		  `title` varchar(50) NOT NULL COMMENT 'Title',
		  `iso` int(8) NOT NULL COMMENT 'Code ISO',
		  `iso_ddd` varchar(6) NOT NULL COMMENT 'DDD ISO',
		  `population` int(11) NOT NULL DEFAULT '0' COMMENT 'Population',
		  `lat` varchar(180) DEFAULT NULL COMMENT 'Latitude',
		  `lng` varchar(180) DEFAULT NULL COMMENT 'Longitude',
		  `created_at` datetime DEFAULT NULL COMMENT 'Created At',
		  `updated_at` datetime DEFAULT NULL COMMENT 'Updated At',
		  `status` enum('0','1') NOT NULL DEFAULT '1' COMMENT 'Status',
		  PRIMARY KEY (`id`),
		  KEY `FK_id_state_city` (`id_state`),
		  CONSTRAINT `FK_id_state_city` FOREIGN KEY (`id_state`) REFERENCES `state` (`id`)
		) ENGINE=InnoDB AUTO_INCREMENT=5571 DEFAULT CHARSET=utf8;
		
		Data for the table `city` 
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
	
	@JsonManagedReference
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
