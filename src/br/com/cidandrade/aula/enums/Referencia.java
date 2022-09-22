package br.com.cidandrade.aula.enums;

public enum Referencia {
    VIZINHANCA("Vizinhança"),
    TRABALHO("Trabalho"),
    IGREJA("Igreja"),
    EX("Ex"),
    FAMILIA("Família"),
    FACULDADE("Faculdade"),
    OUTROS("Outros");
    private final String referencia;

    public static Referencia getReferenciaPorNome(String nome) {
        Referencia retorno = OUTROS;
        for (Referencia r : Referencia.values()) {
            if (r.getReferencia().equalsIgnoreCase(nome)) {
                retorno = r;
            }
        }
        return retorno;
    }

    private Referencia(String referencia) {
        this.referencia = referencia;
    }

    public String getReferencia() {
        return referencia;
    }
}
