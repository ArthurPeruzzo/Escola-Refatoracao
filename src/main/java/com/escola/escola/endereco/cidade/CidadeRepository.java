package com.escola.escola.endereco.cidade;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CidadeRepository extends CrudRepository<Cidade, Long> {

    @Query("SELECT c FROM Cidade c WHERE " +
            "LOWER(c.nome) LIKE LOWER(CONCAT('%',:nome, '%')) OR " +
            "LOWER(c.nome) LIKE LOWER(CONCAT('%',:nome, '%'))")
    List<Cidade> buscarCidadePorNome(String nome);
}
