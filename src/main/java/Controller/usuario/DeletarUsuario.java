package Controller;

import Dao.DataHandler;
import Model.Usuario;

public class DeletarUsuario {
    DeletarUsuario() {
        try {
            DataHandler manipulador = new DataHandler();
            manipulador.setTabela("tb_usuarios");
            manipulador.setCamposTabela("id");
            manipulador.setValores("'19'");
            manipulador.deletar();
            System.out.println("deu bom");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
