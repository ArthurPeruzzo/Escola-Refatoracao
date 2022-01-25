package com.escola.escola.contato;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Api("Contato")
@RestController
@RequestMapping(value = "/contato")
public class ContatoController {

    final ContatoService contatoService;

    public ContatoController(ContatoService contatoService) {
        this.contatoService = contatoService;
    }

    @PostMapping("/inserir")
    @ApiOperation(value = "Inserir contato")
    public Contato inserirContato(@RequestBody @Valid Contato contato){
        return contatoService.inserirContato(contato);
    }


}
