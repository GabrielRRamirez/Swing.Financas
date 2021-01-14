/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;

/**
 *
 * @author Samsung
 */
public class ModelConta {
    private int id;
    private int idTipoMovimento;
    private int idEvento;
    private String data;
    private int idcartao;
    private String observacao;
    private double valorAnterior;
    private double ValorAtual;
    private double valor;

    
    public ModelConta() {
    }

    public ModelConta(int id, int idTipoMovimento, int idEvento, String data, int idcartao, String observacao, double valorAnterior, double ValorAtual, double valor) {
        this.id = id;
        this.idTipoMovimento = idTipoMovimento;
        this.idEvento = idEvento;
        this.data = data;
        this.idcartao = idcartao;
        this.observacao = observacao;
        this.valorAnterior = valorAnterior;
        this.ValorAtual = ValorAtual;
        this.valor = valor;
    }

    public ModelConta(int idTipoMovimento, int idEvento, String data, int idcartao, String observacao, double valorAnterior, double ValorAtual, double valor) {
        this.idTipoMovimento = idTipoMovimento;
        this.idEvento = idEvento;
        this.data = data;
        this.idcartao = idcartao;
        this.observacao = observacao;
        this.valorAnterior = valorAnterior;
        this.ValorAtual = ValorAtual;
        this.valor = valor;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdTipoMovimento() {
        return idTipoMovimento;
    }

    public void setIdTipoMovimento(int idTipoMovimento) {
        this.idTipoMovimento = idTipoMovimento;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getIdcartao() {
        return idcartao;
    }

    public void setIdcartao(int idcartao) {
        this.idcartao = idcartao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public double getValorAnterior() {
        return valorAnterior;
    }

    public void setValorAnterior(double valorAnterior) {
        this.valorAnterior = valorAnterior;
    }

    public double getValorAtual() {
        return ValorAtual;
    }

    public void setValorAtual(double ValorAtual) {
        this.ValorAtual = ValorAtual;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
    
    
}
