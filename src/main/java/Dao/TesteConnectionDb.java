/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.SQLException;

/**
 *
 * @author Samsung
 */
public class TesteConnectionDb {

    public static void main(String[] args)  {
        try {
            ConnectionDb con = new ConnectionDb();
            System.out.println("Conexão realizada com sucesso.");
        }catch (SQLException e){
            System.out.println("Erro ao se conectar com o banco de dados " + "Erro " + e.getMessage());

        }

    }
}
