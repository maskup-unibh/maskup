/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lojinha.database;

import com.mycompany.lojinha.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author rafap
 */
public class ClienteBD {

    private static Statement state;

    public static void insertCliente(Cliente c) {

        state = Conexao.getConexao();
        String sql = "INSERT INTO cliente(codigo,nome,email,telefone) VALUES"
                + "('" + c.getCodigo() + "','" + c.getNome() + "','" + c.getEmail() + "','" + c.getTelefone()
                + "');";

        try {
            state.executeUpdate(sql);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir no banco de dados!", "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.fecharConexao();
        }
    }

    public static Cliente consultaClienteBD(String sql) throws SQLException {
        Cliente c = new Cliente();
        ResultSet rs;

        state = Conexao.getConexao();
        rs = state.executeQuery(sql);

        while (rs.next()) {

            c.setCodigo(rs.getInt(1));
            c.setNome(rs.getString(2));
            c.setEmail(rs.getString(3));
            c.setTelefone(rs.getString(4));
        }
        return c;
    }

    public static ResultSet consultaClientesBD(String sql) throws SQLException {
        ResultSet rs;
        state = Conexao.getConexao();
        rs = state.executeQuery(sql);
        return rs;
    }

    public static void alteraAClienteBD(Cliente c) throws SQLException {
        state = Conexao.getConexao();
        String sql;
        sql = "UPDATE cliente SET nome = '" + c.getNome() + "',"
                + " email = '" + c.getEmail() + "',"
                + " telefone = '" + c.getTelefone() + ","
                + " WHERE codigo = " + c.getCodigo() + ";";
        try {
            state.executeUpdate(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar no banco de dados!", "Erro", JOptionPane.ERROR_MESSAGE);

        } finally {
            Conexao.fecharConexao();
        }

    }

    public static void excluirClienteBD(Cliente c) throws SQLException {
        String sql = "DELETE FROM cliente WHERE codigo= " + c.getCodigo() + ";";
        Statement s = Conexao.getConexao();
        s.execute(sql);
        Conexao.fecharConexao();
    }

}
