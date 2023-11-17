package Dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDb {

        Connection con;
        String user;
        String senha;
        String url;

    public ConnectionDb() throws SQLException {

        user = "postgres";
        senha = "102030";
        url = "jdbc:postgresql://localhost:5432/bd_gerenciador";

        try {

            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, user, senha);
            System.out.println("Conexão realizada com sucesso.");

        } catch (Exception e) {
           e.printStackTrace();
            System.out.println(e.getMessage() + "\n Erro ao conectar ao banco de dados!");
        }





    }



    }

