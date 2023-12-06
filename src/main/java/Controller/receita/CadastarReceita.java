package Controller.receita;

import Dao.DataHandler;

import javax.swing.*;
import java.util.Date;

public class CadastarReceita {
    CadastarReceita(String nome, Double valor) {

        try {

            Date dataInsercao = new Date();
            DataHandler manipulador = new DataHandler();
            manipulador.setTabela("tb_receitas");
            manipulador.setCamposTabela("nome, valor, dataInsercao");
            manipulador.setValores("'" + nome + "', '" + valor + "', '" + dataInsercao + "'");
            manipulador.cadastrar();

            if (manipulador.getStatus()) {
                JOptionPane.showMessageDialog(null, "Receita  cadastrada com sucesso!!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar receita!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage() + "\n Erro ao cadastrar receita no banco de dados!");
        }

    }

}
