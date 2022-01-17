package com.escola.escola.pessoa;

import com.escola.escola.endereco.Endereco;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

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

    @OneToMany
    @JsonIgnore
    @JoinColumn(name = "pessoa")
    List<Endereco> enderecos;

}
