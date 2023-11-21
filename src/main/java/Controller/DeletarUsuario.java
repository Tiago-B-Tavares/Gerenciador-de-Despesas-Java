package Controller;

import Dao.DataHandler;
import Model.Usuario;

public class DeletarUsuario {
    DeletarUsuario() {
        try {
            DataHandler manipulador = new DataHandler();
            manipulador.setTabela("tb_usuarios");
            manipulador.setCamposTabela("nome");
            manipulador.setValores("'teste'");
            manipulador.deletar();
            System.out.println("deu bom");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DeletarUsuario d = new DeletarUsuario();
    }
}
