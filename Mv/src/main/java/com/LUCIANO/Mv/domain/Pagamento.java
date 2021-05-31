package com.LUCIANO.Mv.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.LUCIANO.Mv.domain.enums.EstadoPagamento;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pagamento  implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	
	private Integer id;
	private Integer  estado;
	
	
	@OneToOne
	@JoinColumn(name = "cliente_id")
	@MapsId
	private Cliente cliente;
	
	
	
	public Pagamento() {
		
	}



	public Pagamento(Integer id, EstadoPagamento estado, Cliente cliente) {
		super();
		this.id = id;
		this.estado = estado.getCod();
		this.cliente = cliente;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public EstadoPagamento getEstado() {
		return EstadoPagamento.toEnum(estado);
	}



	public void setEstado(EstadoPagamento estado) {
		this.estado = estado.getCod();
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
		Pagamento other = (Pagamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
