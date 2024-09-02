package org.example;

public class ValidadorCPF extends ValidadorTemplate {

    @Override
    protected boolean verificarFormato() {
        System.out.println("Verificando formato do CPF...");
        // Exemplo de verificação simples: tamanho de 11 caracteres
        return getDocumento().length() == 11;
    }

    @Override
    protected boolean verificarConsistencia() {
        System.out.println("Verificando consistência do CPF...");
        // Exemplo simplificado de consistência: apenas verifica se não são todos dígitos iguais
        String cpf = getDocumento();
        return !cpf.matches("(\\d)\\1{10}");
    }

    @Override
    public String getTipo() {
        return "CPF";
    }
}
