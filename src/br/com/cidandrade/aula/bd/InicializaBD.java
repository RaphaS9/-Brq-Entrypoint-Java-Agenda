package br.com.cidandrade.aula.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InicializaBD {

    public static void inicializarBD() {
        String sql;
        Connection con = conectar();
        sql = "Create table if not exists conhecido "
                + "(id int not null auto_increment primary key, "
                + "nome varchar(30) not null, "
                + "referencia varchar(10) not null, "
                + "unique key (nome, referencia))";
        execute(con, sql);
        sql = "Create table if not exists contato "
                + "(id int not null auto_increment primary key, "
                + "idConhecido int not null, "
                + "tipo varchar(10) not null, "
                + "identificacao varchar(40) not null, "
                + "foreign key (idConhecido) references conhecido(id))";
        execute(con, sql);
        sql = "Insert into conhecido (nome, referencia) values ('Gumercindo', 'Igreja')";
        execute(con, sql);
        sql = "Insert into conhecido (nome, referencia) values ('Adolfo', 'Trabalho')";
        execute(con, sql);
        sql = "Insert into conhecido (nome, referencia) values ('Abigail', 'Vizinhança')";
        execute(con, sql);
        sql = "Insert into conhecido (nome, referencia) values ('Jennifer', 'Outros')";
        execute(con, sql);
        sql = "Insert into contato (idConhecido, tipo, identificacao) "
                + "values (1, 'email', 'gugu@hotmail.com')";
        execute(con, sql);
        sql = "Insert into contato (idConhecido, tipo, identificacao) "
                + "values (2, 'WhatsApp', '+55 11 987654321')";
        execute(con, sql);
        sql = "Insert into contato (idConhecido, tipo, identificacao) "
                + "values (3, 'Instagram', '@bibi_oficial')";
        execute(con, sql);
        sql = "Insert into contato (idConhecido, tipo, identificacao) "
                + "values (4, 'Twitter', 'je_foguinho')";
        execute(con, sql);
        sql = "Insert into contato (idConhecido, tipo, identificacao) "
                + "values (4, 'Telegram', '+55 11 98989898')";
        execute(con, sql);
        desconectar(con);
    }

    public static Connection conectar() {
        Connection con = null;
        final String USUARIO = "cidandrade";
        final String SENHA = "123456";
        final String URL = "jdbc:mysql://localhost/agenda";
        try {
            con = DriverManager.getConnection(URL,
                    USUARIO, SENHA);
        } catch (SQLException ex) {
            //   Base.mensagemDeErro("Não foi possível conectar ao banco de dados. "
            //           + "Verifique e tente posteriormente");
            System.exit(1);
        }
        return con;
    }

    public static void desconectar(Connection c) {
        try {
            c.close();
        } catch (SQLException ex) {
        }
    }

    private static void execute(Connection con, String sql) {
        try {
            con.createStatement().executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
            //   Base.mensagemDeErro("Não foi possível executar\n" + sql);
            System.exit(1);
        }
    }
}
