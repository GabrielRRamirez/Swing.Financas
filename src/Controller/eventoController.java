/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import DAO.eventoDao;
import Models.ModelEvento;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Samsung
 */
public class eventoController {
    eventoDao dao = new eventoDao();
    
    public int insereEvento(ModelEvento evento){       
        
        return dao.insereEvento(evento);
    }
    
    public List<ModelEvento> buscaEvento(String descricao, int situacaoCad){
        return dao.buscaEvento(descricao, situacaoCad);
    }
    
    public int atualizaEvento(ModelEvento evento){
        return dao.atualizaEvento(evento);
    }
    
    public int apagaEvento(int id){
        return dao.apagaEvento(id);
    }
    public List<ModelEvento> buscaId(int id){
        return dao.buscaId(id);
    }
}
