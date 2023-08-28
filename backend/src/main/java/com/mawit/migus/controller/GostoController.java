package com.mawit.migus.controller;

import com.mawit.migus.entity.Gosto;
import com.mawit.migus.service.GostoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gosto")
public class GostoController {

    @Autowired
    private GostoService service;

    @GetMapping
    public List<Gosto> buscarTodos(){
        return service.buscarTodos();
    }

    @PostMapping
    public Gosto inserir(@RequestBody Gosto objeto){
        return service.inserir(objeto);
    }

    @PutMapping
    public Gosto alterar(@RequestBody Gosto objeto){
        return service.alterar(objeto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        service.excluir(id);
        return ResponseEntity.ok().build();
    }


}
