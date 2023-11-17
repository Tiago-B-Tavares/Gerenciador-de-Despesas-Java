package Controller;

import Dao.HandlerData;
import Model.Usuario;

public class CadastrarUsuario {


    public static void main(String[] args) {


         String nome;
         String email;
         String senha;



        Usuario user = new Usuario();
        HandlerData handler = new HandlerData();
        handler.cadastrar();
    }



}
