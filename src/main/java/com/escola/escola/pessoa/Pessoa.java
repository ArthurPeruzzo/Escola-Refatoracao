package com.escola.escola.pessoa;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @ApiModelProperty("Identificado")
    @Column(name = "pessoaid")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "seq_pessoa")
    @SequenceGenerator(name = "seq_pessoa", sequenceName = "seq_pessoa", allocationSize = 1)
    private Long id;

    @ApiModelProperty("Nome")
    @Column(name = "nome")
    @NotNull
    private String nome;

    @ApiModelProperty("CPF")
    @Column(name = "cpf")
    @CPF(message = "CPF inválido!")
    @NotNull
    private String cpf;

}
