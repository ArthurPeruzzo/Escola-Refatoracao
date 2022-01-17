package com.escola.escola.endereco;

import com.escola.escola.endereco.cidade.Cidade;
import com.escola.escola.endereco.estado.Estado;
import com.escola.escola.pessoa.Pessoa;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "endereco")
public class Endereco {

    @Id
    @ApiModelProperty("Identificado")
    @Column(name = "enderecoid")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "seq_endereco")
    @SequenceGenerator(name = "seq_endereco", sequenceName = "seq_endereco", allocationSize = 1)
    private Long id;

    @ApiModelProperty("Cidade")
    @JoinColumn(name = "cidadeid")
    @ManyToOne
    @NotNull
    private Cidade cidade;

    @ApiModelProperty("Estado")
    @JoinColumn(name = "estadoid")
    @ManyToOne
    @NotNull
    private Estado estado;

    @ApiModelProperty("Rua")
    @Column(name = "rua")
    private String rua;

    @ApiModelProperty("Número")
    @Column(name = "numero")
    private Integer numero;

    @ApiModelProperty("Pessoa")
    @JoinColumn(name = "pessoaid")
    @ManyToOne
    private Pessoa pessoa;

}
