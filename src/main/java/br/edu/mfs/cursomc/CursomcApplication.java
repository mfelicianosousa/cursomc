package br.edu.mfs.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.mfs.cursomc.domain.Categoria;
import br.edu.mfs.cursomc.domain.Produto;
import br.edu.mfs.cursomc.domain.Segmento;
import br.edu.mfs.cursomc.repositories.CategoriaRepository;
import br.edu.mfs.cursomc.repositories.ProdutoRepository;
import br.edu.mfs.cursomc.repositories.SegmentoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	@Autowired 
	private ProdutoRepository produtoRepository ;
	
	@Autowired 
	private CategoriaRepository categoriaRepository ;
	
	@Autowired 
	private SegmentoRepository segmentoRepository ;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria( 0, "INFORMATICA", 0) ;
		Categoria cat2 = new Categoria( 0, "ESCRITORIO",0) ;
		
		Produto p1 = new Produto(0,"Computador",2000, 1500) ;
		Produto p2 = new Produto(0, "Impressora",800,500) ;
		Produto p3 = new Produto(0, "Mouse",80,40) ;
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3)) ;
		cat2.getProdutos().addAll(Arrays.asList(p2)) ;
		
				
		p1.getCategorias().addAll(Arrays.asList(cat1)) ;
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2)) ;
		p3.getCategorias().addAll(Arrays.asList(cat1)) ;
		
		
		Segmento seg1 = new Segmento(0,"PROGRAMAS DE INFORMÁTICA SOB ENCOMENDA; DESENVOLVIMENTO, PRODUÇÃO, DOCUMENTAÇÃO DE", "6201.5") ;
		Segmento seg2 = new Segmento(0,"ENTREGA DE REFEIÇÕES, ALIMENTOS PARA RESTAURANTES; SERVIÇOS DE", "5320-2") ;
		
		cat1.getSegmentos().addAll(Arrays.asList(seg1));
		cat2.getSegmentos().addAll(Arrays.asList(seg1));
		
		segmentoRepository.saveAll(Arrays.asList(seg1,seg2)) ;
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2)) ;
		
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3)) ;
		
		
	}

}
