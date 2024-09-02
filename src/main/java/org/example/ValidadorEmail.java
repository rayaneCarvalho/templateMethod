package org.example;

public class ValidadorEmail extends ValidadorTemplate {

    @Override
    protected boolean verificarFormato() {
        System.out.println("Verificando formato do E-mail...");
        // Verifica se contém "@" e "."
        String email = getDocumento();
        return email.contains("@") && email.contains(".");
    }

    @Override
    protected boolean verificarConsistencia() {
        System.out.println("Verificando consistência do E-mail...");
        // Exemplo simplificado: verifica se não contém espaços em branco
        return !getDocumento().contains(" ");
    }

    @Override
    public String getTipo() {
        return "E-mail";
    }
}

