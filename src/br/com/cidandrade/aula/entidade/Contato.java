package br.com.cidandrade.aula.entidade;

import br.com.cidandrade.aula.enums.TipoContato;

public class Contato {

    private int id;
    private Conhecido conhecido;
    private TipoContato tipo;
    private String identificacao;

    public Contato(Conhecido conhecido, TipoContato tipo, 
            String identificacao) {
        this.conhecido = conhecido;
        this.tipo = tipo;
        this.identificacao = identificacao;
    }

    public Contato(int id, Conhecido conhecido, TipoContato tipo, 
            String identificacao) {
        this.id = id;
        this.conhecido = conhecido;
        this.tipo = tipo;
        this.identificacao = identificacao;
    }

    public int getId() {
        return id;
    }

    public Conhecido getConhecido() {
        return conhecido;
    }

    public TipoContato getTipo() {
        return tipo;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setConhecido(Conhecido conhecido) {
        this.conhecido = conhecido;
    }

    public void setTipo(TipoContato tipo) {
        this.tipo = tipo;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }
}
