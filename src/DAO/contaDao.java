
package DAO;
  
import dbConnection.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class contaDao {
    
    Connection conn = null;
    PreparedStatement st = null;
    
    
    public int insereConta(Models.ModelConta conta)  {
        int linhasAfetadas = 0;
        try{
            conn = connection.getConnection();
            st = conn.prepareStatement("insert into logconta(observacao, datamovimento, id_cartao, id_tipomovimento, id_evento, valoranterior, valoratual, valormovimento) values\n" +
                                        "(?, ?, ?, ?, ?, ((select saldo from cartao where id = ?)), ((select sum(saldo + ? ) from cartao where id = ?)), ?)");
            st.setString(1, conta.getObservacao());
            st.setString(2, conta.getData());
            st.setInt(3, conta.getIdcartao());
            st.setInt(4, conta.getIdTipoMovimento());
            st.setInt(5, conta.getIdEvento());
            st.setInt(6, conta.getIdcartao());
            st.setDouble(7, conta.getValor());
            st.setInt(8, conta.getIdcartao());
            st.setDouble(9, conta.getValor());
            
             linhasAfetadas = st.executeUpdate();
            
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
           connection.closeStatement(st);
           connection.closeConnection();
        } return linhasAfetadas;
        
    }
    
}
