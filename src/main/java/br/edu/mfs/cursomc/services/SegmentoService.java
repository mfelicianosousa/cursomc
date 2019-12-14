package br.edu.mfs.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.mfs.cursomc.domain.Categoria;
import br.edu.mfs.cursomc.domain.Segmento;
import br.edu.mfs.cursomc.repositories.SegmentoRepository;

@Service
public class SegmentoService {
	
	@Autowired
	private SegmentoRepository repo ;
	

	public Segmento buscar(Integer id ) {
		
		Optional<Segmento> obj = repo.findById(id);
		
		return obj.orElse( null );
	}

}
