package com.example.demo.service;

import com.example.demo.model.FactorialResponse;
import com.example.demo.rest.SaludoController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class FactorialServiceTest {
    @Mock
    private FactorialService factorialService;

    @InjectMocks
    private SaludoController saludoController;

    @Test
    void calcularFactorial_PositiveNumber_ReturnsFactorial() {
        when(factorialService.calcularFactorial(5)).thenReturn(120L);
        FactorialResponse response = saludoController.calcularFactorial(5);
        assertEquals(5, response.getNumero());
        assertEquals(120, response.getResultado());
    }

    @Test
    void calcularFactorial_Zero_ReturnsOne() {
        when(factorialService.calcularFactorial(0)).thenReturn(1L);
        FactorialResponse response = saludoController.calcularFactorial(0);
        assertEquals(0, response.getNumero());
        assertEquals(1, response.getResultado());
    }

    @Test
    void calcularFactorial_NegativeNumber_ThrowsException() {
        when(factorialService.calcularFactorial(-5)).thenThrow(IllegalArgumentException.class);
        assertThrows(IllegalArgumentException.class, () -> saludoController.calcularFactorial(-5));
    }
}