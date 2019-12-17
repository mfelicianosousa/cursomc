package br.edu.mfs.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.mfs.cursomc.domain.Estado;

import br.edu.mfs.cursomc.services.EstadoService;

@RestController
@RequestMapping(value="/Estado")
public class EstadoResource {

	@Autowired
	private EstadoService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable String uf ) {
		
		Estado obj = service.find(uf ) ;
		
		return ResponseEntity.ok().body(obj);

	}
}
