package com.mawit.migus.service;

import com.mawit.migus.entity.Gosto;
import com.mawit.migus.repository.GostosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GostoService {

    @Autowired
    private GostosRepository repository;

    public List<Gosto> buscarTodos(){
        return repository.findAll();
    }

    public Gosto inserir(Gosto pessoa){
        return repository.saveAndFlush(pessoa);
    }

    public Gosto alterar(Gosto pessoa){
        return repository.saveAndFlush(pessoa);
    }

    public void excluir(Long id){
        Gosto objeto = repository.findById(id).get();
        repository.delete(objeto);
    }

}
