package br.edu.mfs.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.mfs.cursomc.domain.Estado;
import br.edu.mfs.cursomc.exceptions.ObjectNotFoundException;
import br.edu.mfs.cursomc.repositories.EstadoRepository;

@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository repo ;
	
	public Estado find(String uf ) {
		Optional<Estado> obj = repo.findById(uf) ;
		return obj.orElseThrow(() -> new ObjectNotFoundException( "Objeto nâo encontrado ! Id: "+uf+ ", Tipo : " + Estado.class.getName())) ;
		
		
	}
}
