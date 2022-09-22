package br.com.cidandrade.aula.entidade;

import br.com.cidandrade.aula.enums.Referencia;

public class Conhecido {

    private int id;
    private String nome;
    private Referencia referencia;

    public Conhecido(String nome, Referencia referencia) {
        this.nome = nome;
        this.referencia = referencia;
    }

    public Conhecido(int id, String nome, Referencia referencia) {
        this.id = id;
        this.nome = nome;
        this.referencia = referencia;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Referencia getReferencia() {
        return referencia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setReferencia(Referencia referencia) {
        this.referencia = referencia;
    }
}
