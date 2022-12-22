package com.lucas.designpatterns.service.impl;

import com.lucas.designpatterns.model.Cliente;
import com.lucas.designpatterns.model.ClienteRepository;
import com.lucas.designpatterns.service.ClienteServeice;
import org.springframework.beans.factory.annotation.Autowired;

public class ClienteServiceImpl implements ClienteServeice {
    @Autowired
    ClienteRepository repository;

    @Override
    public Iterable<Cliente> buscarTodos() {
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return null;
    }

    @Override
    public void inserir(Cliente cliente) {

    }

    @Override
    public void atualizar(Long id, Cliente cliente) {

    }

    @Override
    public void deletar(Long id) {

    }
}
