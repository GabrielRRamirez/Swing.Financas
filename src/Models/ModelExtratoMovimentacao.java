
package Models;

import java.util.Date;

public class ModelExtratoMovimentacao {
  
    
    
    private String descricaoCartao;
    private double valorAnterior;
    private double valoratual;
    private String descricaoOperacao;
    private String descEventoFinanceiro;
    private Date datamovimento;
    private String observacao;
    private int idTipoMovimento;
    private double valorMovimento;

    public ModelExtratoMovimentacao() {
    }

    public ModelExtratoMovimentacao(String descricaoCartao, double valorAnterior, double valoratual, String descricaoOperacao, String descEventoFinanceiro, Date datamovimento, String observacao, int idTipoMovimento, double valorMovimento) {
        this.idTipoMovimento = idTipoMovimento;
        this.descricaoCartao = descricaoCartao;
        this.valorAnterior = valorAnterior;
        this.valoratual = valoratual;
        this.descricaoOperacao = descricaoOperacao;
        this.descEventoFinanceiro = descEventoFinanceiro;
        this.datamovimento = datamovimento;
        this.observacao = observacao;
        this.valorMovimento = valorMovimento;
    }

   
    public String getDescricaoCartao() {
        return descricaoCartao;
    }

    public void setDescricaoCartao(String descricaoCartao) {
        this.descricaoCartao = descricaoCartao;
    }

    public double getValorAnterior() {
        return valorAnterior;
    }

    public void setValorAnterior(double valorAnterior) {
        this.valorAnterior = valorAnterior;
    }

    public double getValoratual() {
        return valoratual;
    }

    public void setValoratual(double valoratual) {
        this.valoratual = valoratual;
    }

    public String getDescricaoOperacao() {
        return descricaoOperacao;
    }

    public void setDescricaoOperacao(String descricaoOperacao) {
        this.descricaoOperacao = descricaoOperacao;
    }

    public String getDescEventoFinanceiro() {
        return descEventoFinanceiro;
    }

    public void setDescEventoFinanceiro(String descEventoFinanceiro) {
        this.descEventoFinanceiro = descEventoFinanceiro;
    }

    public Date getDatamovimento() {
        return datamovimento;
    }

    public void setDatamovimento(Date datamovimento) {
        this.datamovimento = datamovimento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public int getIdTipoMovimento() {
        return idTipoMovimento;
    }

    public void setIdTipoMovimento(int idTipoMovimento) {
        this.idTipoMovimento = idTipoMovimento;
    }

    public double getValorMovimento() {
        return valorMovimento;
    }

    public void setValorMovimento(double valorMovimento) {
        this.valorMovimento = valorMovimento;
    }
    
    
    
           
    
    
}
