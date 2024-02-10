package com.nesrux.rinhabackend.domain.service;

import com.nesrux.rinhabackend.domain.model.Cliente;
import com.nesrux.rinhabackend.domain.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;

    public List<Cliente> listarTodos(){
        return repository.findAll();
    }
}
