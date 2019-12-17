package br.edu.mfs.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.mfs.cursomc.domain.Pessoa;
import br.edu.mfs.cursomc.exceptions.ObjectNotFoundException;
import br.edu.mfs.cursomc.repositories.PessoaRepository;


@Service
public class PessoaService {

	@Autowired
	private PessoaRepository repo ;
	
	public Pessoa find(Integer id ) {
		Optional<Pessoa> obj = repo.findById(id) ;
		return obj.orElseThrow(() -> new ObjectNotFoundException( "Objeto nâo encontrado ! Id: "+id + ", Tipo : " + Pessoa.class.getName())) ;
		
		
	}
}
