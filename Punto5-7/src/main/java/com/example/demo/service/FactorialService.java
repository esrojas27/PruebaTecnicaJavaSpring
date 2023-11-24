package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class FactorialService {

    public long calcularFactorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo.");
        }
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }

}
