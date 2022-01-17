package com.escola.escola.pessoa;

import com.escola.escola.endereco.Endereco;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("Pessoa")
@RestController
@RequestMapping(value = "/pessoa")
public class PessoaController {

    final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @GetMapping("/buscar/{id}")
    @ApiOperation(value = "Buscar pessoa por id")
    public Pessoa buscarPessoa(@PathVariable(value = "id") Long id){
        return pessoaService.buscarPessoaPorId(id);
    }

    @PostMapping("/inserir")
    @ApiOperation(value = "Inserir pessoa")
    public Pessoa inserirPessoa(@RequestBody Pessoa pessoa){
        return pessoaService.inserirPessoa(pessoa);
    }

    @PutMapping("/atualizar")
    @ApiOperation(value = "Atualizar pessoa")
    public Pessoa atualizarPessoa(@RequestBody Pessoa pessoa){
        return pessoaService.atualizarPessoa(pessoa);
    }


    @DeleteMapping("/deletar/{id}")
    @ApiOperation(value = "Deletar pessoa por id")
    public void deletarPessoa(@PathVariable(value = "id") Long id){
        pessoaService.deletarPessoa(id);
    }

    @GetMapping("/buscarendereco/{id}")
    @ApiOperation(value = "Buscar endereços da pessoa por id")
    public List<Endereco> buscaPessoaComSeusEnderecosPorId(@PathVariable(value = "id") Long id){
        return pessoaService.buscaPessoaComSeusEnderecosPorId(id);
    }

}
