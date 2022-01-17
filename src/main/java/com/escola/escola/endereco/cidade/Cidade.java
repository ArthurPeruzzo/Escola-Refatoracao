package com.escola.escola.endereco.cidade;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
@Data
@AllArgsConstructor
@Entity
@Builder
@Table(name = "cidade")
public class Cidade {

    @Id
    @ApiModelProperty("Identificador")
    @Column(name = "cidadeid")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "seq_cidade")
    @SequenceGenerator(name = "seq_cidade", sequenceName = "seq_cidade", allocationSize = 1)
    private Long id;

    @ApiModelProperty("Nome")
    @Column(name = "nome")
    @NotNull
    private String nome;

    public Cidade() {

    }

}
