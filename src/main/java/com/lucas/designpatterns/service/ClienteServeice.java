package com.lucas.designpatterns.service;

import com.lucas.designpatterns.model.Cliente;

public interface ClienteServeice {
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}
