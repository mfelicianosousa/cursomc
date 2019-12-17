package br.edu.mfs.cursomc.domain.enums;

public enum TipoEndereco {
	RESIDENCIAL(1,"Residencial"), COMERCIAL(2,"Comercial"), ENTREGA(3,"Entrega");
	private int codigo ;
    private String descricao ;
    
    private TipoEndereco ( int codigo, String descricao ) {
    	this.codigo = codigo ;
    	this.descricao = descricao ;
    }
    
    public int getCodigo() {
    	return codigo ;
    }
    
    public String getDescricao() {
    	return descricao ;
    }
    
    public static TipoEndereco toEnum(Integer codigo) {
    	/*
    	 * Retorna o Tipo de Endereço
    	 * 
    	 * */
    	if (codigo == null) {
    		return null ;
    	}
    	
    	for (TipoEndereco x : TipoEndereco.values()) {
    		if (codigo.equals(x.getCodigo())) {
    			return x ;
    		}
    	}
    	
    	throw new IllegalArgumentException("Tipo de Endereço Inválido : "+codigo ) ;
    }

}
