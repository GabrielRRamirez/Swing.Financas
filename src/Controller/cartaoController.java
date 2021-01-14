/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.cartaoDao;
import Models.ModelCartao;
import java.util.List;

/**
 *
 * @author Samsung
 */
public class cartaoController {
    cartaoDao dao = new cartaoDao();
    
    public int insereCartao(ModelCartao cartao){       
        
        return dao.insereCartao(cartao);
    }
    
    public List<ModelCartao> buscaCartao(String descricao, int situacaoCad){
        return dao.buscaCartao(descricao, situacaoCad);
    }
    
    public int atualizaCartao(ModelCartao cartao){
        System.out.println("passou controller");
        return dao.atualizaCartao(cartao);
    }
    
    public int apagaCartao(int id){
        return dao.apagaCartao(id);
    }
    public List<ModelCartao> buscaId(int id){
        return dao.buscaId(id);
    }
}
