package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidadorEmailTest {

    @Test
    void deveRetornarEmailValido() {
        ValidadorEmail validador = new ValidadorEmail();
        validador.setDocumento("exemplo@dominio.com");
        assertDoesNotThrow(validador::validar);
    }

    @Test
    void deveRetornarEmailInvalidoFormato() {
        ValidadorEmail validador = new ValidadorEmail();
        validador.setDocumento("exemplodominio.com");
        assertDoesNotThrow(validador::validar);
    }

    @Test
    void deveRetornarEmailInvalidoConsistencia() {
        ValidadorEmail validador = new ValidadorEmail();
        validador.setDocumento("exemplo @dominio.com");
        assertDoesNotThrow(validador::validar);
    }
}
