package Controller;

import Dao.DataHandler;
import Model.Usuario;

public class AlterarUsuario {
    public static void main(String[] args) {
         Usuario user = new Usuario();
    DataHandler manipulador = new DataHandler();
    manipulador.setTabela("tb_usuarios");
    manipulador.executaBuscaTodosUsuarios();

    
    
    }
   
    
}
