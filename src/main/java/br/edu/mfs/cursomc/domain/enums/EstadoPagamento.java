package br.edu.mfs.cursomc.domain.enums;

public enum EstadoPagamento {
	
	PENDENTE(1,"Pendente"),
	QUITADO(2,"Quitado") ,
	PARCELADO(3,"PARCELADO") ;
	
    private int codigo ;
    private String descricao ;
    
    private EstadoPagamento ( int codigo, String descricao ) {
    	this.codigo = codigo ;
    	this.descricao = descricao ;
    }
    
    public int getCodigo() {
    	return codigo ;
    }
    
    public String getDescricao() {
    	return descricao ;
    }
    
    public static EstadoPagamento toEnum(Integer codigo) {
    	/*
    	 * Retorna o código do Pagamento selecionado 
    	 * 
    	 * */
    	if (codigo == null) {
    		return null ;
    	}
    	
    	for (EstadoPagamento x : EstadoPagamento.values()) {
    		if (codigo.equals(x.getCodigo())) {
    			return x ;
    		}
    	}
    	
    	throw new IllegalArgumentException("Estado Pagamento Inválido : "+codigo ) ;
    }
}
