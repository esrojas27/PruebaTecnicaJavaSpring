package com.example.demo.service;

import com.example.demo.model.ClienteInfo;
import com.example.demo.util.ClienteException;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    public ClienteInfo consultarCliente(String tipoDocumento, String numeroDocumento) {
        // Lógica para validar los parámetros y generar la respuesta
        if (!validarTipoDocumento(tipoDocumento) || !validarNumeroDocumento(numeroDocumento)) {
            throw new ClienteException(400, "Parámetros de entrada inválidos");
        }

        // Lógica para "quemar" los datos del cliente
        ClienteInfo clienteInfo = new ClienteInfo();
        clienteInfo.setPrimerNombre("Juan");
        clienteInfo.setSegundoNombre("Carlos");
        clienteInfo.setPrimerApellido("Pérez");
        clienteInfo.setSegundoApellido("Gómez");
        clienteInfo.setTelefono("123456789");
        clienteInfo.setDireccion("Calle 123");
        clienteInfo.setCiudadResidencia("Bogotá");

        return clienteInfo;
    }

    private boolean validarTipoDocumento(String tipoDocumento) {
        if (tipoDocumento == null || tipoDocumento.isEmpty()) {
            throw new ClienteException(400, "El tipo de documento es obligatorio");
        }

        return tipoDocumento.equals("C") || tipoDocumento.equals("P");
    }

    private boolean validarNumeroDocumento(String numeroDocumento) {
        if (numeroDocumento == null || numeroDocumento.isEmpty()) {
            throw new ClienteException(400, "El número de documento es obligatorio");
        }

        // Lógica adicional de validación si es necesario

        return true;
    }
}
