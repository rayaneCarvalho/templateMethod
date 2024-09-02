package org.example;

public abstract class ValidadorTemplate {

    private String documento;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void validar() {
        coletarDocumento();
        if (verificarFormato() && verificarConsistencia()) {
            System.out.println(getTipo() + " é válido.");
        } else {
            System.out.println(getTipo() + " é inválido.");
        }
    }

    protected void coletarDocumento() {
        System.out.println("Coletando documento: " + this.documento);
    }

    protected abstract boolean verificarFormato();

    protected abstract boolean verificarConsistencia();

    public abstract String getTipo();
}
