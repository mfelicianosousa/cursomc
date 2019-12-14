package br.edu.mfs.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.mfs.cursomc.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria cat1 = new Categoria(1, "Informática", 0) ;
		Categoria cat2 = new Categoria(2, "Escritório", 0) ;
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1) ;
		lista.add(cat2) ;
		
		return lista ;
	}

}
