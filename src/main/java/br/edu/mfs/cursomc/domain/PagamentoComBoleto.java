package br.edu.mfs.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import br.edu.mfs.cursomc.domain.enums.EstadoPagamento;

@Entity 
public class PagamentoComBoleto extends Pagamento {
	
	private static final long serialVersionUID = 1L;
	
	private Date dataVencimento ;
	private Date dataPagamento ;
	
	public PagamentoComBoleto() {
		
	}

	
	public PagamentoComBoleto(int id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
		super(id, estado, pedido);
		this.setDataVencimento(dataVencimento);
		this.setDataPagamento(dataPagamento);
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
