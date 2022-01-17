package com.escola.escola.pessoa;

import com.escola.escola.endereco.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    @Query("select e from Pessoa p inner join Endereco e on e.pessoa.id = p.id where p.id = :id")
    List<Endereco> buscaPessoaComSeusEnderecosPorId(Long id);
}
