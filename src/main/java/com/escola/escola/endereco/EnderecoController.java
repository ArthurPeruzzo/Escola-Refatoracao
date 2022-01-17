package com.escola.escola.endereco;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api("Endereço")
@RestController
@RequestMapping(value = "/endereco")
public class EnderecoController {

    final EnderecoService enderecoService;

    public EnderecoController(EnderecoService enderecoService) {
        this.enderecoService = enderecoService;
    }

    @GetMapping("/buscar/{id}")
    @ApiOperation(value = "Buscar endereco por id")
    public Endereco buscarEndereco(@PathVariable(value = "id") Long id){
        return enderecoService.buscarEnderecoPorId(id);
    }

    @PostMapping("/inserir")
    @ApiOperation(value = "Inserir endereco")
    public Endereco inserirEndereco(@RequestBody Endereco endereco){
        return enderecoService.inserirEndereco(endereco);
    }

    @PutMapping("/atualizar")
    @ApiOperation(value = "Atualizar endereco")
    public Endereco atualizarEndereco(@RequestBody Endereco endereco){
        return enderecoService.atualizarEndereco(endereco);
    }


    @DeleteMapping("/deletar/{id}")
    @ApiOperation(value = "Deletar endereco por id")
    public void deletarEndereco(@PathVariable(value = "id") Long id){
        enderecoService.deletarEndereco(id);
    }

}
