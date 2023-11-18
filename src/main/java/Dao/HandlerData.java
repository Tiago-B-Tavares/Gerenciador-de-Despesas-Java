package Dao;

import java.sql.SQLException;

public class HandlerData {

    ConnectionDb con;


     public String tabela;
     public String camposTabela;
     public String valores;
     String valorId;


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




    public void cadastrar(String tabela, String camposTabela, String valores){
        String sql = " INSERT INTO" + this.tabela + "(" + this.camposTabela + ") VALUES (" + this.valores + ")";
        int res = con.executaSQL(sql);
        if (res > 0) {
            System.out.println("cadastrado com sucesso!");
        } else {
            System.out.println("Erro ao cadastrar!");
        }
    }

    public void alterar() {
    }

    public void deletar() {
    }

    public void buscar() {
    }


}
