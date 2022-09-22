package br.com.cidandrade.aula.enums;

import static br.com.cidandrade.aula.enums.Referencia.OUTROS;

public enum TipoContato {
    EMAIL("email"),
    WHATSAPP("WhatsApp"),
    INSTAGRAM("Instagram"),
    TWITTER("Twitter"),
    TELEGRAM("Telegram"),
    FACEBOOK("Facebook");
    private final String tipoContato;

    public static TipoContato getTipoContatoPorNome(String nome) {
        TipoContato retorno = WHATSAPP;
        for (TipoContato tc : TipoContato.values()) {
            if (tc.getTipoContato().equalsIgnoreCase(nome)) {
                retorno = tc;
            }
        }
        return retorno;
    }

    private TipoContato(String tipoContato) {
        this.tipoContato = tipoContato;
    }

    public String getTipoContato() {
        return tipoContato;
    }

}
