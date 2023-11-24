package com.example.demo.rest;

import com.example.demo.model.FactorialResponse;
import com.example.demo.service.FactorialService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class SaludoController {

    private final FactorialService factorialService;

    public SaludoController(FactorialService factorialService) {
        this.factorialService = factorialService;
    }

    @GetMapping("/hola")
    public Map<String, String> saludar() {
        Map<String, String> respuesta = new HashMap<>();
        respuesta.put("mensaje", "¡Hola desde el equipo de desarrollo DreamTeam!");
        return respuesta;
    }

    @GetMapping("/factorial/{numero}")
    public FactorialResponse calcularFactorial(@PathVariable int numero) {
        long resultado = factorialService.calcularFactorial(numero);
        return new FactorialResponse(numero, resultado);
    }
}
