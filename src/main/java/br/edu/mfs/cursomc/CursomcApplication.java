package br.edu.mfs.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.mfs.cursomc.domain.Categoria;
import br.edu.mfs.cursomc.domain.Segmento;
import br.edu.mfs.cursomc.repositories.CategoriaRepository;
import br.edu.mfs.cursomc.repositories.SegmentoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

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
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2)) ;
		
		Segmento seg1 = new Segmento(0,"PROGRAMAS DE INFORMÁTICA SOB ENCOMENDA; DESENVOLVIMENTO, PRODUÇÃO, DOCUMENTAÇÃO DE", "6201.5") ;
		Segmento seg2 = new Segmento(0,"ENTREGA DE REFEIÇÕES, ALIMENTOS PARA RESTAURANTES; SERVIÇOS DE", "5320-2") ;
		
		segmentoRepository.saveAll(Arrays.asList(seg1,seg2)) ;
		
		
	}

}
