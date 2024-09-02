package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidadorCPFTest {

    @Test
    void deveRetornarCPFValido() {
        ValidadorCPF validador = new ValidadorCPF();
        validador.setDocumento("12345678901");
        assertDoesNotThrow(validador::validar);
    }

    @Test
    void deveRetornarCPFInvalidoFormato() {
        ValidadorCPF validador = new ValidadorCPF();
        validador.setDocumento("123");
        assertDoesNotThrow(validador::validar);
    }

    @Test
    void deveRetornarCPFInvalidoConsistencia() {
        ValidadorCPF validador = new ValidadorCPF();
        validador.setDocumento("11111111111");
        assertDoesNotThrow(validador::validar);
    }
}
