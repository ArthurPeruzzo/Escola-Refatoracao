package com.escola.escola.pessoa.aluno;

import org.springframework.stereotype.Service;

@Service
public record AlunoService(AlunoRepository alunoRepository) {

    public Aluno buscarAlunoPorId(Long id) {
        return alunoRepository.findById(id).orElse(null);
    }


    public Aluno inserirAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public Aluno atualizarAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public void deletarAluno(Long id) {
        alunoRepository.deleteById(id);
    }

}
