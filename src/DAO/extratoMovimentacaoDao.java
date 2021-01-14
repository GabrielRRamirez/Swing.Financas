
package DAO;


import Models.ModelConta;
import Models.ModelExtratoMovimentacao;
import dbConnection.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Samsung
 */
public class extratoMovimentacaoDao {
    
    
    
    public List<ModelExtratoMovimentacao> buscaMovimentacao(int idCartao, String dataInicio, String dataFim){
        List<ModelExtratoMovimentacao> conta = new ArrayList<>();
        
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        
        
        try {
            conn = connection.getConnection();
            
            st = conn.prepareStatement("select c.descricao ,  l.valoranterior ,  l.valoratual ,l.id_tipomovimento, tm.descricao , e.descricao , l.datamovimento , l.observacao, l.valormovimento  from logconta l\n" +
                                        "inner join cartao c on\n" +
                                        "c.id = l.id_cartao\n" +
                                        "inner join tipomovimento tm on\n" +
                                        "tm.id = l.id_tipomovimento\n" +
                                        "inner join eventofinanceiro e on\n" +
                                        "e.id = l.id_evento\n" +
                                        "where l.id_cartao = ? and l.datamovimento between ? and ? " );
            st.setInt(1, idCartao);
            st.setString(2, dataInicio);
            st.setString(3, dataFim);
            rs = st.executeQuery();
            

            while (rs.next()) {
                ModelExtratoMovimentacao model = new ModelExtratoMovimentacao();
                model.setDescricaoCartao(rs.getString("c.descricao"));
                model.setValorAnterior(rs.getDouble("l.valoranterior"));
                model.setValoratual(rs.getDouble("l.valoratual"));
                model.setDescricaoOperacao(rs.getString("tm.descricao"));
                model.setDescEventoFinanceiro(rs.getString("e.descricao"));
                model.setDatamovimento(rs.getDate("l.datamovimento"));
                model.setObservacao(rs.getString("l.observacao"));
                model.setIdTipoMovimento(rs.getInt("l.id_tipomovimento"));
                model.setValorMovimento(rs.getDouble("l.valormovimento"));
                
                conta.add(model);
                
                

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        } finally {
            connection.closeResultset(rs);
            connection.closeStatement(st);
           connection.closeConnection();
        }
       
        return conta;
    }
}
