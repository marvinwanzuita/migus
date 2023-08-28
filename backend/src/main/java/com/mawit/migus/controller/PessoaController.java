package com.mawit.migus.controller;

import com.mawit.migus.entity.Pessoa;
import com.mawit.migus.service.PessoaService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService service;

    @GetMapping
    public List<Pessoa> buscarTodos(){
        return service.buscarTodos();
    }

    @PostMapping
    public Pessoa inserir(@RequestBody Pessoa pessoa){
        return service.inserir(pessoa);
    }

    @PutMapping
    public Pessoa alterar(@RequestBody Pessoa pessoa){
        return service.alterar(pessoa);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        service.excluir(id);
        return ResponseEntity.ok().build();
    }


}
