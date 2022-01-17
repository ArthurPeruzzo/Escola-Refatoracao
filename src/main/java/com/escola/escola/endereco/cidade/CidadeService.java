package com.escola.escola.endereco.cidade;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record CidadeService(CidadeRepository cidadeRepository) {

    public List<Cidade> buscaCidadePorNome(String nome){
        return cidadeRepository.buscarCidadePorNome(nome);
    }

    public Cidade inserirCidade(Cidade cidade) {
        return cidadeRepository.save(cidade);
    }
}
