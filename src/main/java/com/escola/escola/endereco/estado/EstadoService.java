package com.escola.escola.endereco.estado;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record EstadoService(EstadoRepository estadoRepository) {

    public List<Estado> buscaEstadoPorSigla(String sigla){
        return estadoRepository.buscarEstadoPorSigla(sigla);
    }

    public Estado inserirEstado(Estado estado) {
        return estadoRepository.save(estado);
    }

}
