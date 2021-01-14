
package Controller;

import DAO.extratoMovimentacaoDao;
import Models.ModelExtratoMovimentacao;
import java.util.List;


public class extratoMovimentacaoController {
    extratoMovimentacaoDao dao = new extratoMovimentacaoDao();
    ModelExtratoMovimentacao modelExtrato = new ModelExtratoMovimentacao();
    
    
    public List<ModelExtratoMovimentacao> buscaMovimentacao(int idCartao, String dataInicio, String dataFim){
        return dao.buscaMovimentacao(idCartao, dataInicio, dataFim);
    }
    
}
