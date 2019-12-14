package br.edu.mfs.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.mfs.cursomc.domain.Segmento;

@Repository
public interface SegmentoRepository extends JpaRepository<Segmento, Integer >{

}
