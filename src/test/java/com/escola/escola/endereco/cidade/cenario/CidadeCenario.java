package com.escola.escola.endereco.cidade.cenario;

import com.escola.escola.endereco.cidade.Cidade;

import java.util.List;

public class CidadeCenario {

    public List<Cidade> criaCidades(){
        Cidade patoBranco = Cidade.builder()
                .id(1L)
                .nome("Pato Branco").build();

        Cidade saoDomingos = Cidade.builder()
                .id(2L)
                .nome("São Domingos").build();
        return List.of(patoBranco, saoDomingos);
    }

}
