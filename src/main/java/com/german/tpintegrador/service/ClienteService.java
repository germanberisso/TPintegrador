package com.german.tpintegrador.service;

import com.german.tpintegrador.entity.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface

ClienteService {
    // Create
    Cliente saveCliente(Cliente p);

    // Read
    List<Cliente> getAllClientes();

    // Update
    Cliente updateCliente(Cliente p, Long id);

    // Delete
    void deleteClienteById(Long id);
}
