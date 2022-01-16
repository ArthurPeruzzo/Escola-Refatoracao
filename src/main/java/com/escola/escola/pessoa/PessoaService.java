package com.escola.escola.pessoa;

import org.springframework.stereotype.Service;

@Service
public record PessoaService(PessoaRepository pessoaRepository) {

    public Pessoa buscarPessoaPorId(Long id) {
        return pessoaRepository.findById(id).orElse(null);
    }


    public Pessoa inserirPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public Pessoa atualizarPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public void deletarPessoa(Long id) {
        pessoaRepository.deleteById(id);
    }

}
