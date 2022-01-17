package com.escola.escola.endereco.cidade;

import com.escola.escola.endereco.cidade.cenario.CidadeCenario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class CidadeTest {

    private CidadeService cidadeService;

    @Mock
    private CidadeRepository cidadeRepository;

    private final List<Cidade> cidadeCenario = new CidadeCenario().criaCidades();

    @BeforeEach
    public void beforeEach(){
        MockitoAnnotations.initMocks(this);
        this.cidadeService = new CidadeService(cidadeRepository);
    }

}