/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lojinha;

import com.mycompany.lojinha.database.ClienteBD;
import com.mycompany.lojinha.database.Conexao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafap
 */
public class Principal {

    private static Produto Produto;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexao con = new Conexao();
        Cliente c = new Cliente(1,"Rafaela Moreira");
        
        try {
            ClienteBD.excluirClienteBD(c);
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        c.setEmail("rafapcmor@gmail.com");
        c.setTelefone("34557-7555");
       
    
    }
    
}
