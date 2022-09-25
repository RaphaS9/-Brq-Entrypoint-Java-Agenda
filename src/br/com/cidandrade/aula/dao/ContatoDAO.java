package br.com.cidandrade.aula.dao;

import br.com.cidandrade.aula.Base;
import br.com.cidandrade.aula.bd.OperacaoBD;
import br.com.cidandrade.aula.entidade.Conhecido;
import br.com.cidandrade.aula.entidade.Contato;
import br.com.cidandrade.aula.enums.TipoContato;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO {

    private static final String INSERT_SQL = "Insert into contato "
            + "(idConhecido, tipo, identificacao) "
            + "values (%d, '%s', '%s')";
    private static final String UPDATE_SQL = "Update contato "
            + "set tipo = '%s', identificacao = '%s' "
            + "where id = %d";
    private static final String DELETE_SQL = "Delete from contato "
            + "where id = %d";
    private static final String SELECT_TODOS = "Select * from contato";
    private static final String SELECT_POR_CONHECIDO = "Select * "
            + "from contato where idConhecido = %d";

    public static void inserir(Contato contato) {
        String identificacao = contato.getIdentificacao();
        if (!identificacao.isEmpty()) {
            String sql = String.format(INSERT_SQL,
                    contato.getConhecido().getId(),
                    contato.getTipo(),
                    identificacao);
            OperacaoBD.execute(sql, true, "Inserido com sucesso");
        } else {
            Base.mensagemDeErro("O campo não pode ser nulo");
        }
    }

    public static void alterar(Contato contato) {
        String identificacao = contato.getIdentificacao();
        if (!identificacao.isEmpty()) {
            String sql = String.format(UPDATE_SQL,
                    contato.getTipo().getTipoContato(),
                    identificacao,
                    contato.getId());
            OperacaoBD.execute(sql, true, "Alterado com sucesso");
        } else {
            Base.mensagemDeErro("O campo não pode ser nulo");
        }
    }

    public static void apagar(Contato contato) {
        String sql = String.format(DELETE_SQL,
                contato.getId());
        OperacaoBD.execute(sql, true, "Removido com sucesso");
    }

    public static List<Contato> selecionarTodos() {
        List<Contato> lista = new ArrayList<>();
        Connection con = OperacaoBD.conectar();
        try {
            ResultSet rs = con.createStatement().executeQuery(SELECT_TODOS);
            while (rs.next()) {
                int id = rs.getInt("id");
                int idConhecido = rs.getInt("idConhecido");
                String tipo = rs.getString("tipo");
                String identificacao = rs.getString("identificacao");
                lista.add(new Contato(id,
                        ConhecidoDAO.getConhecidoPorId(
                                idConhecido),
                        TipoContato.getTipoContatoPorNome(tipo),
                        identificacao));
            }
            OperacaoBD.desconectar(con);
        } catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
            System.exit(1);
        }
        return lista;
    }

    public static List<Contato> selecionarPorConhecido(Conhecido conhecido) {
        List<Contato> lista = new ArrayList<>();
        Connection con = OperacaoBD.conectar();
        try {
            String sql = String.format(SELECT_POR_CONHECIDO,
                    conhecido.getId());
            ResultSet rs = con.createStatement().executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                int idConhecido = rs.getInt("idConhecido");
                String tipo = rs.getString("tipo");
                String identificacao = rs.getString("identificacao");
                lista.add(new Contato(id,
                        ConhecidoDAO.getConhecidoPorId(
                                idConhecido),
                        TipoContato.getTipoContatoPorNome(tipo),
                        identificacao));
            }
            OperacaoBD.desconectar(con);
        } catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
            System.exit(1);
        }
        return lista;
    }

    public static List<Contato> selecionarPorConhecido(int conhecido) {
        List<Contato> lista = new ArrayList<>();
        Connection con = OperacaoBD.conectar();
        try {
            String sql = String.format(SELECT_POR_CONHECIDO,
                    conhecido);
            ResultSet rs = con.createStatement().executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                int idConhecido = rs.getInt("idConhecido");
                String tipo = rs.getString("tipo");
                String identificacao = rs.getString("identificacao");
                lista.add(new Contato(id,
                        ConhecidoDAO.getConhecidoPorId(
                                idConhecido),
                        TipoContato.getTipoContatoPorNome(tipo),
                        identificacao));
            }
            OperacaoBD.desconectar(con);
        } catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
            System.exit(1);
        }
        return lista;
    }

}
