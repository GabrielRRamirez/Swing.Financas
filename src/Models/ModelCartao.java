
package Models;

public class ModelCartao {
    private int id;
    private String descricao;
    private int idTipocartao;
    private int idSituacaoCadastro;
    private double saldo;
    private double limite;
    private int vencimento;
    private String descTipo;

    public ModelCartao() {
    }

    public ModelCartao( String descricao, int idTipocartao, int idSituacaoCadastro, double saldo) {
        this.descricao = descricao;
        this.idTipocartao = idTipocartao;
        this.idSituacaoCadastro = idSituacaoCadastro;
        this.saldo = saldo;
    }
    public ModelCartao(int id, String descricao, int idTipocartao, int idSituacaoCadastro, double saldo) {
        this.id = id;
        this.descricao = descricao;
        this.idTipocartao = idTipocartao;
        this.idSituacaoCadastro = idSituacaoCadastro;
        this.saldo = saldo;
    }
    
    

    public ModelCartao( String descricao, int idTipocartao, int idSituacaoCadastro, double saldo, double limite, int vencimento) {
        this.descricao = descricao;
        this.idTipocartao = idTipocartao;
        this.idSituacaoCadastro = idSituacaoCadastro;
        this.saldo = saldo;
        this.limite = limite;
        this.vencimento = vencimento;
    }
    
    public ModelCartao(int id, String descricao, int idTipocartao, int idSituacaoCadastro, double saldo, double limite, int vencimento) {
        this.id = id;
        this.descricao = descricao;
        this.idTipocartao = idTipocartao;
        this.idSituacaoCadastro = idSituacaoCadastro;
        this.saldo = saldo;
        this.limite = limite;
        this.vencimento = vencimento;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }

    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdTipocartao() {
        return idTipocartao;
    }

    public void setIdTipocartao(int idTipocartao) {
        this.idTipocartao = idTipocartao;
    }

    public int getIdSituacaoCadastro() {
        return idSituacaoCadastro;
    }

    public void setIdSituacaoCadastro(int idSituacaoCadastro) {
        this.idSituacaoCadastro = idSituacaoCadastro;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public int getVencimento() {
        return vencimento;
    }

    public void setVencimento(int vencimento) {
        this.vencimento = vencimento;
    }

    public String getDescTipo() {
        return descTipo;
    }

    public void setDescTipo(String descTipo) {
        this.descTipo = descTipo;
    }
    
    
    
}
