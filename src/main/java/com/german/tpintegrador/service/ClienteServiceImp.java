package com.german.tpintegrador.service;

import com.german.tpintegrador.entity.Cliente;
import com.german.tpintegrador.repository.ClienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImp implements ClienteService {
    @Autowired
    private ClienteRepo clienteRepo;
    @Override
    public Cliente saveCliente(Cliente c) {
        return clienteRepo.save(c);
    }
    @Override
    public List<Cliente> getAllClientes() {
        return clienteRepo.findAll();
    }
    @Override
    public Cliente updateCliente(Cliente cliente, Long id) {
        Cliente clienteDB = clienteRepo.getReferenceById(id);
        if(!cliente.getRazonSocial().trim().isEmpty())
            clienteDB.setRazonSocial(cliente.getRazonSocial());
        if (!cliente.getCuit().trim().isEmpty())
            clienteDB.setCuit(cliente.getCuit());;
        if (!cliente.getMail().trim().isEmpty())
            clienteDB.setMail(cliente.getMail());

        return clienteRepo.save(clienteDB);
    }

    @Override
    public void deleteClienteById(Long id) {

    }
}