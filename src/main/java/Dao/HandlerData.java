package Dao;

import java.sql.SQLException;

public class HandlerData {

    ConnectionDb con;


    String tabela;
    String camposTabela;
    String valores;
    String valorId;


    public void setCon(ConnectionDb con) {
        this.con = con;
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

    {
        try {
            con = new ConnectionDb();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void cadastrar(){
        String sql = " INSERT INTO" + this.tabela + "(" + this.camposTabela+ ") VALUES (" + this.valores + ")";
        int res = con.executaSQL(sql);
        if (res > 0){
            System.out.println("Usuário cadastrado com sucesso!");
        }else {
            System.out.println("Erro ao cadastrar usuário!");
        }
    }

    public void alterar(){}

    public void deletar(){}

    public void buscar(){}





}
