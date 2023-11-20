package Controller;

import Dao.HandlerData;
import Model.Usuario;
import com.sun.source.tree.TryTree;

public class AlterarUsuario {
    public static void main(String[] args) {
         Usuario user = new Usuario();
    HandlerData manipulador = new HandlerData();
    manipulador.setTabela("tb_usuarios");
    manipulador.executaBuscaTodosUsuarios();
    //avv
    
    
    }
   
    
}
