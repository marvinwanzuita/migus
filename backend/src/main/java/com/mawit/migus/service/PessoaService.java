package com.mawit.migus.service;

import com.mawit.migus.entity.Pessoa;
import com.mawit.migus.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    public List<Pessoa> buscarTodos(){
        return repository.findAll();
    }

    public Pessoa inserir(Pessoa pessoa){
        return repository.saveAndFlush(pessoa);
    }

    public Pessoa alterar(Pessoa pessoa){
        return repository.saveAndFlush(pessoa);
    }

    public void excluir(Long id){
        Pessoa pessoa = repository.findById(id).get();
        repository.delete(pessoa);
    }

}
