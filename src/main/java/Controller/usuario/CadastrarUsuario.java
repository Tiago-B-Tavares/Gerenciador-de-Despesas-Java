package Controller.usuario;

import Dao.DataHandler;

import javax.swing.*;

public class CadastrarUsuario {


    public CadastrarUsuario(String nome, String email, String senha) {

        try {

                DataHandler manipulador = new DataHandler();
                manipulador.setTabela("tb_usuarios");
                manipulador.setCamposTabela("nome, email, senha");
                manipulador.setValores("'" + nome + "', '" + email + "', '" + senha + "'");
                manipulador.cadastrar();

                if (manipulador.getStatus()) {
                    JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!!");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário!!");
                }


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage() + "\n Erro ao cadastrar usuario no banco de dados!");
        }

    }

}
