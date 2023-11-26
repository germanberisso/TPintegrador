package com.german.tpintegrador.service;

import com.german.tpintegrador.entity.Cliente;
import com.german.tpintegrador.repository.ClienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImp implements ClienteService {
    @Autowired
    private ClienteRepo clienteRepo;
    public Cliente saveCliente(Cliente c) {
        return clienteRepo.save(c);
    }

}