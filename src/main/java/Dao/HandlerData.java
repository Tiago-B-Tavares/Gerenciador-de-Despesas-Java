package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HandlerData {

    ConnectionDb con;

    private String tabela;
    private String camposTabela;
    private String valores;
    private String valorId;
    private boolean status;

    {
        try {
            con = new ConnectionDb();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void setTabela(String tabela) {
        this.tabela = tabela;
    }

    public void setCamposTabela(String camposTabela) {
        this.camposTabela = camposTabela;
    }

    public void setValores(String valores) {
        this.valores = valores;
    }

    public void setValorId(String valorId) {
        this.valorId = valorId;
    }

    public boolean getStatus() {
        return status;
    }

    public void cadastrar() {

        String sql = " INSERT INTO " + this.tabela + "(" + this.camposTabela + ") VALUES ( " + this.valores + ")";

        int res = con.executaSQL(sql);
        if (res > 0) {
            this.status = true;
            System.out.println("cadastro realizado com sucesso!");
        } else {
            this.status = false;
            System.out.println("Erro ao cadastrar!");
        }
    }

    public void alterar() {
    }

    public void deletar() {
    }

    public void executaBuscaTodosUsuarios() {

        String sql = "SELECT * FROM " + this.tabela;
        ResultSet rs = con.executaBuscaSQL(sql);

        try {
            while (rs.next()) {
                int id = rs.getInt("idUsuario");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String senha = rs.getString("senha");
                System.out.println(id + " - " + nome );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
