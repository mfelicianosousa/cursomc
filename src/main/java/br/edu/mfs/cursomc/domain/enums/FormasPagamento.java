package br.edu.mfs.cursomc.domain.enums;

public enum FormasPagamento {
	Boleto(1,"BOLETO"),
	CARTAODEBITO(2,"Cartão Debito"),
	CARTAOCREDITO(3,"Cartão Credito"),
	PAYPAL(4,"PayPal"),
	PAGSEGURO(5,"PagSeguro") ;
	
	private int codigo ;
    private String descricao ;
    
    private FormasPagamento ( int codigo, String descricao ) {
    	this.codigo = codigo ;
    	this.descricao = descricao ;
    }
    
    public int getCodigo() {
    	return codigo ;
    }
    
    public String getDescricao() {
    	return descricao ;
    }
    
    public static FormasPagamento toEnum(Integer codigo) {
    	/*
    	 * Retorna o código do Pagamento selecionado 
    	 * 
    	 * */
    	if (codigo == null) {
    		return null ;
    	}
    	
    	for (FormasPagamento x : FormasPagamento.values()) {
    		if (codigo.equals(x.getCodigo())) {
    			return x ;
    		}
    	}
    	
    	throw new IllegalArgumentException("Formas de Pagamento Inválido : "+codigo ) ;
    }

}
