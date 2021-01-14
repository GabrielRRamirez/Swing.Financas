
package DAO;

import Models.ModelCartao;
import dbConnection.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class cartaoDao {
    
    
    
    public int insereCartao(ModelCartao cartao) {
        int linhasAfetadas = 0;
        Connection conn = null;
        PreparedStatement st = null;
        
        try {
            conn = connection.getConnection();
            st = conn.prepareStatement("insert into cartao (id_tipocartao, id_situacaocadastro, descricao,saldo,valorlimite , datavencimento) values(?,?, ?, ?, ?, ?)");
            st.setInt(1, cartao.getIdTipocartao());
            st.setInt(2, cartao.getIdSituacaoCadastro());
            st.setString(3, cartao.getDescricao());
            st.setDouble(4, cartao.getSaldo());
            st.setDouble(5, cartao.getLimite());
            st.setInt(6, cartao.getVencimento());
            
            

            linhasAfetadas = st.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            connection.closeStatement(st);
            connection.closeConnection();
        }
        return linhasAfetadas;
    }
    
    
    public int atualizaCartao(ModelCartao cartao) {
        System.out.println("chegou cartao - " + cartao.getId() + cartao.getDescricao() + cartao.getIdTipocartao() + cartao.getIdSituacaoCadastro()+ cartao.getSaldo() + cartao.getLimite()+cartao.getVencimento());
        int linhasAfetadas = 0;
        Connection conn = null;
        PreparedStatement st = null;
        try {
            conn = connection.getConnection();
            st = conn.prepareStatement("update cartao set id_tipocartao = ?, id_situacaocadastro =?, descricao = ?,saldo = ?,valorlimite = ? , datavencimento = ? where id = ?");
            st.setInt(1, cartao.getIdTipocartao());
            st.setInt(2, cartao.getIdSituacaoCadastro());
            st.setString(3, cartao.getDescricao());
            st.setDouble(4, cartao.getSaldo());
            st.setDouble(5, cartao.getLimite());
            st.setInt(6, cartao.getVencimento());
            st.setInt(7, cartao.getId());
            

            linhasAfetadas = st.executeUpdate();
            System.out.println("tetntou o insert - " + linhasAfetadas);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            connection.closeStatement(st);
            connection.closeConnection();
        }
        return linhasAfetadas;
    }
    
    public int apagaCartao(int id){
        int linhasAfetadas = 0;
        Connection conn = null;
        PreparedStatement st = null;
        try {
            conn = connection.getConnection();
            st = conn.prepareStatement("update cartao set id_situacaocadastro = 0 where id = ?");
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
    
    public List<ModelCartao> buscaCartao(String desc, int situacaoCad){
        List<ModelCartao> cartao = new ArrayList<>();
        
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        
        try {
            conn = connection.getConnection();
            
            st = conn.prepareStatement("select c.id, c.descricao,t.descricao, c.saldo, c.valorlimite, c.datavencimento from cartao c inner join tipocartao t on t.id = c.id_tipocartao where c.descricao like ? and c.id_situacaocadastro = ?" );
            st.setInt(2, situacaoCad);
            st.setString(1, "%" + desc + "%" );
            rs = st.executeQuery();
            

            while (rs.next()) {
                ModelCartao model = new ModelCartao();
                model.setId(rs.getInt("c.id"));
                model.setDescricao(rs.getString("c.descricao"));
                model.setDescTipo(rs.getString("t.descricao"));
                model.setSaldo(rs.getDouble("c.saldo"));
                model.setLimite(rs.getDouble("c.valorlimite"));
                model.setVencimento(rs.getInt("c.datavencimento"));         
                cartao.add(model);
                
                

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        } finally {
            connection.closeResultset(rs);
            connection.closeStatement(st);
           connection.closeConnection();
        }
       
        return cartao;
    }
    
    public List<ModelCartao> buscaId(int id){
        List<ModelCartao> cartao = new ArrayList<>();
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
       
        
        try{
            con = connection.getConnection();
            
            st = con.prepareStatement("select id, descricao, id_situacaocadastro from cartao where id = ?");
            st.setInt(1, id);
            rs = st.executeQuery();
            
            while(rs.next()){
                 ModelCartao model = new ModelCartao();
                model.setId(rs.getInt("id"));
                model.setDescricao(rs.getString("descricao"));
                model.setIdSituacaoCadastro(rs.getInt("id_situacaocadastro"));
                cartao.add(model);
            }
            
        }catch( SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        
        }finally{
            connection.closeConnection();
            connection.closeResultset(rs);        
        }
        return cartao;
    }
    
    public int atualizaSaldo(int idCartao, double valor){
        int linhasAfetadas = 0;
        Connection conn = null;
        PreparedStatement st = null;
        try{
            conn = connection.getConnection();
            st = conn.prepareStatement("UPDATE cartao set saldo = saldo + ? WHERE id = ?" );
            st.setInt(2, idCartao);
            st.setDouble(1, valor);                
          
            linhasAfetadas = st.executeUpdate();
        }catch( SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        
        }finally{
            connection.closeConnection();
            connection.closeStatement(st);
        }return linhasAfetadas;
    }
    
    
    
    
}
