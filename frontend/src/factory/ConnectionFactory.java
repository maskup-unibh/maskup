/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author rafaela.cruz
 */
public class ConnectionFactory {

    private static final String URL = "jdbc:mysql://localhost:3306/loja";
    private static final String usuario = "root";
    private static final String senha = "rwl2019";

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, usuario, senha);
        } catch (SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }

}
