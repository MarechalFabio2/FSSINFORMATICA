/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Fabio
 */
public class ModelVendasFormaPagamento {
    
    private ModelVendas modelVendas;
    private ModelFormaPagamento modelFormaPagamento;
    private ArrayList<ModelVendasFormaPagamento> listaModelVendasFormaPagamento;

    /**
     * @return the modelVendas
     */
    public ModelVendas getModelVendas() {
        return modelVendas;
    }

    /**
     * @param modelVendas the modelVendas to set
     */
    public void setModelVendas(ModelVendas modelVendas) {
        this.modelVendas = modelVendas;
    }

    /**
     * @return the modelFormaPagamento
     */
    public ModelFormaPagamento getModelFormaPagamento() {
        return modelFormaPagamento;
    }

    /**
     * @param modelFormaPagamento the modelFormaPagamento to set
     */
    public void setModelFormaPagamento(ModelFormaPagamento modelFormaPagamento) {
        this.modelFormaPagamento = modelFormaPagamento;
    }

    /**
     * @return the listaModelVendasFormaPagamento
     */
    public ArrayList<ModelVendasFormaPagamento> getListaModelVendasFormaPagamento() {
        return listaModelVendasFormaPagamento;
    }

    /**
     * @param listaModelVendasFormaPagamento the listaModelVendasFormaPagamento to set
     */
    public void setListaModelVendasFormaPagamento(ArrayList<ModelVendasFormaPagamento> listaModelVendasFormaPagamento) {
        this.listaModelVendasFormaPagamento = listaModelVendasFormaPagamento;
    }
    
}
