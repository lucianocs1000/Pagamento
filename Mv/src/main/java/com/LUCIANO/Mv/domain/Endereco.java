package com.LUCIANO.Mv.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ENDERECOS")
public class Endereco implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	private String logradouro;
	
	private String cidade;
	
	private String bairro;
	
	@Column(length = 5)
	private  String numero;
	
	@Column(length = 9)
	private String cep;
	
	@Column(length = 2)
	@Enumerated(EnumType.STRING)
	private UF  uf;
	
	
	private  String complemento;

	
	public Endereco() {
		
	}


	public Endereco(Integer id, String logradouro, String cidade, String bairro, String numero, String cep, UF uf,
			String complemento) {
		super();
		this.id = id;
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.bairro = bairro;
		this.numero = numero;
		this.cep = cep;
		this.uf = uf;
		this.complemento = complemento;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public UF getUf() {
		return uf;
	}


	public void setUf(UF uf) {
		this.uf = uf;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Endereco other = (Endereco) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
	
}
