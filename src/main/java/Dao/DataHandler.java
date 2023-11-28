package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DataHandler {

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
        String sql = "UPDATE " + this.tabela + " SET "+this.camposTabela+ "WHERE = id = "+ this.valorId ;
        int res = con.executaSQL(sql);
        if (res > 0) {
            this.status = true;
            System.out.println("Alterado com sucesso!");
        } else {
            this.status = false;
            System.out.println("Erro ao alterar!");
        }
    }

    public void deletar() {
        String sql = "DELETE FROM " + this.tabela + " WHERE " + this.camposTabela + " = " + this.valores;
        int res = con.executaSQL(sql);
        if (res > 0) {
            this.status = true;
            System.out.println("Deletado com sucesso!");
        } else {
            this.status = false;
            System.out.println("Erro ao deletar!");
        }
    }

    public void buscaDadosUsuarios() {

        String sql = "SELECT * FROM tb_usuarios";
        ResultSet rs = con.executaBuscaSQL(sql);

        try {
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String senha = rs.getString("senha");
                System.out.println(id + " - " + nome+ " - " + email+ " - " + senha );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public boolean validaLogin(String email, String senha) {

        String sql = "SELECT email, senha FROM tb_usuarios";
        ResultSet rs = con.executaBuscaSQL(sql);

        String emailUsuario = null;
        String senhaUsuario = null;
        Boolean liberaAcesso = null;

        try {
            while (rs.next()) {

                //int idUsuario = rs.getInt("id");
                emailUsuario = rs.getString("email");
                senhaUsuario = rs.getString("senha");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (email.equals(emailUsuario) && senha.equals(senhaUsuario)){
            liberaAcesso = true;
            System.out.println("Acesso Liberado");
        }else {
            liberaAcesso = false;
            System.out.println("Acesso não Liberado");
        }
        return liberaAcesso;
    }

}
