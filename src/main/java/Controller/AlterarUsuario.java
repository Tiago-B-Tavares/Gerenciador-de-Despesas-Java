package Controller;

import Dao.DataHandler;
import Model.Usuario;

public class AlterarUsuario {
    AlterarUsuario() {
        Usuario user = new Usuario();
        DataHandler manipulador = new DataHandler();
        manipulador.buscaDadosUsuarios();
    }


}
