package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public int executaSQL(String sql) {
        try {

            Statement smt = con.createStatement();
            int res = smt.executeUpdate(sql);
            con.close();
            return res;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public ResultSet executaBuscaSQL(String sql) {
        try {
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            con.close();
            return rs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

}
