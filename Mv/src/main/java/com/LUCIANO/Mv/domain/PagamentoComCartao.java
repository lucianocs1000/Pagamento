package com.LUCIANO.Mv.domain;

import javax.persistence.Entity;

import com.LUCIANO.Mv.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComCartao  extends Pagamento{
	private static final long serialVersionUID = 1L;

	
	
	
	private Integer numeroDEparcelas;
	private String credito;
	private String debito;
	
	
	
	public PagamentoComCartao() {
		
	}



	public PagamentoComCartao(Integer id, EstadoPagamento estado, Cliente cliente, Integer numeroDEparcelas, String debito, String credito) {
		super(id, estado, cliente);
		this.numeroDEparcelas  =  numeroDEparcelas;
		this.credito  =  credito;
		this.debito = debito;
	}



	public Integer getNumeroDEparcelas() {
		return numeroDEparcelas;
	}



	public void setNumeroDEparcelas(Integer numeroDEparcelas) {
		this.numeroDEparcelas = numeroDEparcelas;
	}



	public String getDebito() {
		return debito;
	}



	public void setDebito(String debito) {
		this.debito = debito;
	}



	public String getCredito() {
		return credito;
	}



	public void setCredito(String credito) {
		this.credito = credito;
	}
	
	
	
	
	
	
	
}
