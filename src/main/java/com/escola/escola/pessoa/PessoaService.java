package com.escola.escola.pessoa;

import com.escola.escola.endereco.Endereco;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Endereco> buscaPessoaComSeusEnderecosPorId(Long id){
        return pessoaRepository.buscaPessoaComSeusEnderecosPorId(id);
    }

}
