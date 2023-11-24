package com.example.demo.rest;

import com.example.demo.model.ClienteInfo;
import com.example.demo.service.ClientService;
import com.example.demo.util.ClienteException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/consultarCliente")
    public ClienteInfo consultarCliente(
            @RequestParam String tipoDocumento,
            @RequestParam String numeroDocumento) {
        try {
            return clientService.consultarCliente(tipoDocumento, numeroDocumento);
        } catch (ClienteException e) {
            throw new ClienteException(e.getStatusCode(), e.getMessage());
        }
    }
}
