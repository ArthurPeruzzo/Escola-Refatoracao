package com.escola.escola.endereco;

import org.springframework.stereotype.Service;

@Service
public record EnderecoService(EnderecoRepository enderecoRepository) {

    public Endereco buscarEnderecoPorId(Long id) {
        return enderecoRepository.findById(id).orElse(null);
    }


    public Endereco inserirEndereco(Endereco enredeco) {
        return enderecoRepository.save(enredeco);
    }

    public Endereco atualizarEndereco(Endereco enredeco) {
        return enderecoRepository.save(enredeco);
    }

    public void deletarEndereco(Long id) {
        enderecoRepository.deleteById(id);
    }

}
