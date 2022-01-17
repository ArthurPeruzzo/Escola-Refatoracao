package com.escola.escola.endereco.cidade;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("Cidade")
@RestController
@RequestMapping(value = "/cidade")
public class CidadeController {

    final CidadeService cidadeService;

    public CidadeController(CidadeService cidadeService) {
        this.cidadeService = cidadeService;
    }

    @GetMapping("/buscar/{nome}")
    @ApiOperation(value = "Buscar cidade pelo nome")
    public List<Cidade> buscarCidadePeloNome(@PathVariable(value = "nome") String nome){
        return cidadeService.buscaCidadePorNome(nome);
    }

    @PostMapping("/inserir")
    @ApiOperation(value = "Inserir cidade")
    public Cidade inserirCidade(@RequestBody Cidade cidade){
        return cidadeService.inserirCidade(cidade);
    }

}
