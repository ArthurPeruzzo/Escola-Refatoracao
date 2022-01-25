package com.escola.escola.pessoa.aluno;

import com.escola.escola.pessoa.Pessoa;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "aluno")
public class Aluno {

    @Id
    @ApiModelProperty("Identificado")
    @Column(name = "alunoid")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "seq_aluno")
    @SequenceGenerator(name = "seq_aluno", sequenceName = "seq_aluno", allocationSize = 1)
    private Long id;

    @ApiModelProperty("Pessoa")
    @JoinColumn(name = "pessoaid")
    @NotNull
    @ManyToOne
    private Pessoa pessoa;

}
