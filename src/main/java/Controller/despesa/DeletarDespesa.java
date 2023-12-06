package Controller.despesa;

import Dao.DataHandler;

public class DeletarDespesa {

    public DeletarDespesa(int id){
        DataHandler manipulador = new DataHandler();
        manipulador.setTabela("tb_despesas");
        manipulador.setCamposTabela("id");
        manipulador.setValorId(id);
        manipulador.deletar();
    }

    public static void main(String[] args) {
        DeletarDespesa d = new DeletarDespesa(3);
    }
}

