package br.edu.mfs.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.mfs.cursomc.domain.Segmento;

@RestController
@RequestMapping(value="/segmento")
public class SegmentoResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Segmento> listar() {
		
		Segmento seg1 = new Segmento(1, "PROGRAMAS DE INFORMÁTICA SOB ENCOMENDA; DESENVOLVIMENTO, PRODUÇÃO, DOCUMENTAÇÃO DE", "6201.5") ;
		Segmento seg2 = new Segmento(2, "ENTREGA DE REFEIÇÕES, ALIMENTOS PARA RESTAURANTES; SERVIÇOS DE", "5320-2") ;
		
		List<Segmento> lista = new ArrayList<>();
		lista.add(seg1) ;
		lista.add(seg2) ;
		
		return lista ;
	}
}
