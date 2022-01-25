package com.escola.escola.pessoa.aluno;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api("Aluno")
@RestController
@RequestMapping(value = "/aluno")
public class AlunoController {


    final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping("/buscar/{id}")
    @ApiOperation(value = "Buscar aluno por id")
    public Aluno buscarAluno(@PathVariable(value = "id") Long id){
        return alunoService.buscarAlunoPorId(id);
    }

    @PostMapping("/inserir")
    @ApiOperation(value = "Inserir aluno")
    public Aluno inserirAluno(@RequestBody Aluno aluno){
        return alunoService.inserirAluno(aluno);
    }


    @DeleteMapping("/deletar/{id}")
    @ApiOperation(value = "Deletar aluno por id")
    public void deletarAluno(@PathVariable(value = "id") Long id){
        alunoService.deletarAluno(id);
    }

}
