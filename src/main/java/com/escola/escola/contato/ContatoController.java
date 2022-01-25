package com.escola.escola.contato;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

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

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationException(MethodArgumentNotValidException ex){
        Map<String, String> errors = new HashMap<>();

        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fildName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fildName, errorMessage);
        });

        return errors;
    }


}
