package com.escola.escola.contato;

import com.escola.escola.pessoa.aluno.Aluno;
import com.escola.escola.pessoa.aluno.AlunoRepository;
import org.springframework.stereotype.Service;

@Service
public record ContatoService(ContatoRepository contatoRepository) {

    public Contato buscarContatoPorId(Long id) {
        return contatoRepository.findById(id).orElse(null);
    }


    public Contato inserirContato(Contato aluno) {
        return contatoRepository.save(aluno);
    }

    public Contato atualizarContato(Contato aluno) {
        return contatoRepository.save(aluno);
    }

    public void deletarContato(Long id) {
        contatoRepository.deleteById(id);
    }

}
