package br.edu.mfs.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.mfs.cursomc.domain.Estado;

public interface EstadoRepository extends JpaRepository<Estado, String > {

}
