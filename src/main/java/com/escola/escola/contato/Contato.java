package com.escola.escola.contato;

import com.escola.escola.pessoa.Pessoa;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;
@Data
@Entity
@Table(name = "contato")
public class Contato {

    @Id
    @ApiModelProperty("Identificado")
    @Column(name = "contatoid")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "seq_contato")
    @SequenceGenerator(name = "seq_contato", sequenceName = "seq_contato", allocationSize = 1)
    private Long id;

    @Pattern(regexp = "^([0-9]{3}|[0-9]{2})?([0-9]{2})([0-9]{4,5})([0-9]{4})", message = "Telefone inválido!")
    @ApiModelProperty("Telefone")
    @Column(name = "telefone")
    private String telefone;

    @Email(message = "Email inválido!")
    @ApiModelProperty("Email")
    @Column(name = "email")
    private String email;

    @ApiModelProperty("Pessoa")
    @JoinColumn(name = "pessoaid")
    @JsonIgnore
    @ManyToOne
    private Pessoa pessoa;

}
