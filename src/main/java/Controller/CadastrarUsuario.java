package Controller;

import Dao.HandlerData;
import Model.Usuario;

public class CadastrarUsuario {
    public static void main(String[] args) {
        Usuario user = new Usuario();
        HandlerData handlerData = new HandlerData();

        String nome = user.getNome();
        String email = user.getEmail();
        String senha = user.getSenha();

        String tabela = "tb_usuarios";
        String camposTabela = "nome, email, senha";
        String valores = "'"+nome +"', '"+email +"', '"+nome +"'";
        handlerData.cadastrar(tabela, camposTabela, valores );


    }

}
