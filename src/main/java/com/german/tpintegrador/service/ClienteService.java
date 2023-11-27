package com.german.tpintegrador.service;

import com.german.tpintegrador.entity.Cliente;
import org.springframework.stereotype.Service;

@Service
public interface


ClienteService {
    Cliente saveCliente(Cliente c);
}
