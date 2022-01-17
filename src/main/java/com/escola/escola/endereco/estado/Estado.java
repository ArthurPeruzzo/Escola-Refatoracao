package com.escola.escola.endereco.estado;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "estado")
public class Estado {

    @Id
    @ApiModelProperty("Identificador")
    @Column(name = "estadoid")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "seq_estado")
    @SequenceGenerator(name = "seq_estado", sequenceName = "seq_estado", allocationSize = 1)
    private Long id;

    @ApiModelProperty("Sigla")
    @Column(name = "sigla")
    @Size(max = 2)
    @NotNull
    private String sigla;

}
