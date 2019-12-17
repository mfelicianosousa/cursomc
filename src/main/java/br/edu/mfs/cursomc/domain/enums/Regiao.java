package br.edu.mfs.cursomc.domain.enums;

public enum Regiao {
	
     NORTE(1,"NORTE"), NORDESTE(2,"NORDESTE"), SUL(3,"SUL"), SUDESTE(4,"SUDESTE"), CENTROOESTE(5,"CENTRO-OESTE");
	 private int codigo ;
	 private String nome ;
	    
	 private Regiao ( int codigo, String nome ) {
	   	this.codigo = codigo ;
	   	this.nome = nome ;
	 }
	    
    public int getCodigo() {
    	return codigo ;
    }
    
    public String getNome() {
    	return nome;
    }
    
    public static Regiao toEnum(Integer codigo) {
    	/*
    	 * Retorna a Região 
    	 * 
    	 * */
    	if (codigo == null) {
    		return null ;
    	}
    	for (Regiao x : Regiao.values()) {
    		if (codigo.equals(x.getCodigo())) {
    			return x ;
    		}
    	}
    	
    	throw new IllegalArgumentException("Região Invalida : "+codigo ) ;
    }
}
