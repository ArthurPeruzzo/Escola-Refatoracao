package com.escola.escola.endereco.estado;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstadoRepository extends CrudRepository<Estado, Long> {

    @Query("SELECT e FROM Estado e WHERE " +
            "LOWER(e.sigla) LIKE LOWER(CONCAT('%',:sigla, '%')) OR " +
            "LOWER(e.sigla) LIKE LOWER(CONCAT('%',:sigla, '%'))")
    List<Estado> buscarEstadoPorSigla(String sigla);

}
