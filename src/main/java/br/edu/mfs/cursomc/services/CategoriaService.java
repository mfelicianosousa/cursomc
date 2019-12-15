package br.edu.mfs.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.mfs.cursomc.domain.Categoria;
import br.edu.mfs.cursomc.exceptions.ObjectNotFoundException;
import br.edu.mfs.cursomc.repositories.CategoriaRepository;


@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo ;
	
	public Categoria find(Integer id ) {
		Optional<Categoria> obj = repo.findById(id) ;
		return obj.orElseThrow(() -> new ObjectNotFoundException( "Objeto nâo encontrado ! Id: "+id + ", Tipo : " + Categoria.class.getName())) ;
		
		
	}
}
