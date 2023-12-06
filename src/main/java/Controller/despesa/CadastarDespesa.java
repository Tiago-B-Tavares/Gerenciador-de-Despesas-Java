package Controller.despesa;

import Dao.DataHandler;

import javax.swing.*;
import java.util.Date;

public class CadastarDespesa {
    CadastarDespesa(String nome, Double valor) {

        try {

            Date dataInsercao = new Date();
            DataHandler manipulador = new DataHandler();
            manipulador.setTabela("tb_despesas");
            manipulador.setCamposTabela("nome, valor, dataInsercao");
            manipulador.setValores("'" + nome + "', '" + valor + "', '" + dataInsercao + "'");
            manipulador.cadastrar();

            if (manipulador.getStatus()) {
                JOptionPane.showMessageDialog(null, "Despesa cadastrada com sucesso!!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar despesa!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage() + "\n Erro ao cadastrar usuario no banco de dados!");
        }

    }
}
