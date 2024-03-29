package br.edu.mfs.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.mfs.cursomc.domain.Cliente;
import br.edu.mfs.cursomc.exceptions.ObjectNotFoundException;
import br.edu.mfs.cursomc.repositories.ClienteRepository;


@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo ;
	
	public Cliente find(Integer id ) {
		Optional<Cliente> obj = repo.findById(id) ;
		return obj.orElseThrow(() -> new ObjectNotFoundException( "Objeto nâo encontrado ! Id: "+id + ", Tipo : " + Cliente.class.getName())) ;
		
		
	}
}
