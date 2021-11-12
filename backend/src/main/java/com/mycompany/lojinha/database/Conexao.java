/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lojinha.database;

/**
 *
 * @author rafap
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {

    public static String status = "Não conectado...";

    private static String serverName, database, url, username, password;

    private static Connection connection = null;
    private static Statement state;

    public Conexao() {
        serverName = "localhost:3306";
        database = "lojinha";
        url = "jdbc:mysql://" + serverName + "/" + database;
        username = "root";
        password = "rafa2018";
    }

    public static Statement getConexao() {

        String driverName = "com.mysql.cj.jdbc.Driver";

        try {
            Class.forName(driverName);

            connection = DriverManager.getConnection(url, username, password);
            state = connection.createStatement();
            if (connection != null) {

                status = ("STATUS: Conectado com sucesso!");

            } else {

                status = ("STATUS: Não foi possivel realizar conexão");

            }

            return state;

        } catch (ClassNotFoundException e) {

            System.out.println("O driver especificado nao foi encontrado.");

            return null;

        } catch (SQLException e) {

            System.out.println("Nao foi possivel conectar ao Banco de Dados.");

            return null;

        }

    }

    public static String statusConexao() {

        return status;

    }

    public static boolean fecharConexao() {

        try {

            Conexao.getConexao().close();

            return true;

        } catch (SQLException e) {

            return false;

        }

    }

}
