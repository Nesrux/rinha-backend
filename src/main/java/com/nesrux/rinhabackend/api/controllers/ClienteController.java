package com.nesrux.rinhabackend.api.controllers;

import com.nesrux.rinhabackend.domain.model.Cliente;
import com.nesrux.rinhabackend.domain.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {
    @Autowired
    private ClienteService service;

    @GetMapping
    public List<Cliente> listAllClient() {
        return service.listarTodos();
    }
}
