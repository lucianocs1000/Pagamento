package com.LUCIANO.Mv.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.LUCIANO.Mv.domain.enums.EstadoPagamento;
@Entity
public class PagamentoComBoleto  extends Pagamento{

	private static final long serialVersionUID = 1L;
	
	private Date  dataVencimento;
	private Date  dataPagamento;
	
	
	public PagamentoComBoleto() {
		
	}


	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Cliente cliente, Date dataVencimento, Date dataPagamento) {
		super(id, estado, cliente);
	this.dataPagamento  =  dataPagamento;
	this.dataVencimento = dataVencimento;
	}


	public Date getDataVencimento() {
		return dataVencimento;
	}


	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}


	public Date getDataPagamento() {
		return dataPagamento;
	}


	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
