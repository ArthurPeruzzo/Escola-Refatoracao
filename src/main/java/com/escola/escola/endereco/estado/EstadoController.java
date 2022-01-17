package com.escola.escola.endereco.estado;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("Estado")
@RestController
@RequestMapping(value = "/estado")
public class EstadoController {

    final EstadoService estadoService;

    public EstadoController(EstadoService estadoService) {
        this.estadoService = estadoService;
    }

    @GetMapping("/buscar/{sigla}")
    @ApiOperation(value = "Buscar estado pela sigla")
    public List<Estado> buscarEstadoPelaSigla(@PathVariable(value = "sigla") String sigla){
        return estadoService.buscaEstadoPorSigla(sigla);
    }

    @PostMapping("/inserir")
    @ApiOperation(value = "Inserir estado")
    public Estado inserirCidade(@RequestBody Estado estado){
        return estadoService.inserirEstado(estado);
    }

}
