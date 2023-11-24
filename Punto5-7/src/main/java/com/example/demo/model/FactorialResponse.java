package com.example.demo.model;

public class FactorialResponse {

    private int numero;
    private long resultado;

    public FactorialResponse(int numero, long resultado) {
        this.numero = numero;
        this.resultado = resultado;
    }

    public int getNumero() {
        return numero;
    }

    public long getResultado() {
        return resultado;
    }
}
