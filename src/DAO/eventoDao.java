
package DAO;

import Models.ModelEvento;
import dbConnection.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class eventoDao {
    
    
    
    public int insereEvento(ModelEvento evento) {
        int linhasAfetadas = 0;
        Connection conn = null;
        PreparedStatement st = null;
        try {
            conn = connection.getConnection();
            st = conn.prepareStatement("insert into eventofinanceiro (descricao, id_situacaocadastro) values(?,?)");
            st.setString(1, evento.getDescricao());
            st.setInt(2, evento.getSituacaoCadastro());
            linhasAfetadas = st.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            connection.closeStatement(st);
            connection.closeConnection();
        }
        return linhasAfetadas;
    }
    
    
    public int atualizaEvento(ModelEvento evento) {
        
        int linhasAfetadas = 0;
        Connection conn = null;
        PreparedStatement st = null;
        try {
            conn = connection.getConnection();
            st = conn.prepareStatement("update eventofinanceiro set descricao = ?, id_situacaocadastro =? where id = ?");
            st.setString(1, evento.getDescricao());
            st.setInt(2, evento.getSituacaoCadastro());
            st.setInt(3, evento.getId());           
            

            linhasAfetadas = st.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            connection.closeStatement(st);
            connection.closeConnection();
        }
        return linhasAfetadas;
    }
    
    public int apagaEvento(int id){
        int linhasAfetadas = 0;
        Connection conn = null;
        PreparedStatement st = null;
        try {
            conn = connection.getConnection();
            st = conn.prepareStatement("update eventofinanceiro set id_situacaocadastro = 0 where id = ?");
            st.setInt(1, id);
    
            linhasAfetadas = st.executeUpdate();
            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            connection.closeStatement(st);
            connection.closeConnection();
        }
        return linhasAfetadas;
    }
    
    public List<ModelEvento> buscaEvento(String desc, int situacaoCad){
        List<ModelEvento> evento = new ArrayList<>();
        
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        
        try {
            conn = connection.getConnection();
            
            st = conn.prepareStatement("select * from eventofinanceiro  where descricao like ? and id_situacaocadastro = ?" );
            st.setInt(2, situacaoCad);
            st.setString(1, "%" + desc + "%" );
            rs = st.executeQuery();
            

            while (rs.next()) {
                ModelEvento model = new ModelEvento();
                model.setId(rs.getInt("id"));
                model.setDescricao(rs.getString("descricao"));
                model.setSituacaoCadastro(rs.getInt("id_situacaocadastro"));
                evento.add(model);
                
                

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        } finally {
            connection.closeResultset(rs);
            connection.closeStatement(st);
           
        }
       
        return evento;
    }
    
    public List<ModelEvento> buscaId(int id){
        List<ModelEvento> evento = new ArrayList<>();
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
       
        
        try{
            con = connection.getConnection();
            
            st = con.prepareStatement("select id, descricao, id_situacaocadastro from eventofinanceiro where id = ?");
            st.setInt(1, id);
            rs = st.executeQuery();
            
            while(rs.next()){
                 ModelEvento model = new ModelEvento();
                model.setId(rs.getInt("id"));
                model.setDescricao(rs.getString("descricao"));
                model.setSituacaoCadastro(rs.getInt("id_situacaocadastro"));
                evento.add(model);
            }
            
        }catch( SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        
        }finally{
            connection.closeConnection();
            connection.closeResultset(rs);        
        }
        return evento;
    }
    
    
    
    
}
