package Controller;

import Dao.DataHandler;

public class ValidarLogin {
    ValidarLogin(){}

    public static void main(String[] args) {
        DataHandler manipula = new DataHandler();
        manipula.buscaDadosUsuarios();
    }
}
