package Controller;

import DAO.cartaoDao;
import DAO.contaDao;


public class contaController {
    contaDao dao = new contaDao();
    cartaoDao daoCartao = new cartaoDao();
    
    public int insereConta(Models.ModelConta conta){
       int linhasAfetadas = dao.insereConta(conta);
       linhasAfetadas += daoCartao.atualizaSaldo(conta.getIdcartao(), conta.getValor());
       return linhasAfetadas;
        
    }
}
