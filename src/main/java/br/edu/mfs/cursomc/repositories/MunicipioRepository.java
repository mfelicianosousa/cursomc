package br.edu.mfs.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.mfs.cursomc.domain.Municipio;
import br.edu.mfs.cursomc.domain.MunicipioPK;

public interface MunicipioRepository extends JpaRepository<Municipio, Integer >{

}
