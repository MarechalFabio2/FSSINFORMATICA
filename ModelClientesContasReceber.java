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
public class ModelClientesContasReceber {
    
    private ModelContasReceber modelContasReceber;
    private ModelCliente modelCliente;
    private ArrayList<ModelClientesContasReceber> listaModelClientesContasReceber;

    /**
     * @return the modelContasReceber
     */
    public ModelContasReceber getModelContasReceber() {
        return modelContasReceber;
    }

    /**
     * @param modelContasReceber the modelContasReceber to set
     */
    public void setModelContasReceber(ModelContasReceber modelContasReceber) {
        this.modelContasReceber = modelContasReceber;
    }

    /**
     * @return the modelCliente
     */
    public ModelCliente getModelCliente() {
        return modelCliente;
    }

    /**
     * @param modelCliente the modelCliente to set
     */
    public void setModelCliente(ModelCliente modelCliente) {
        this.modelCliente = modelCliente;
    }

    /**
     * @return the listaModelClientesContasReceber
     */
    public ArrayList<ModelClientesContasReceber> getListaModelClientesContasReceber() {
        return listaModelClientesContasReceber;
    }

    /**
     * @param listaModelClientesContasReceber the listaModelClientesContasReceber to set
     */
    public void setListaModelClientesContasReceber(ArrayList<ModelClientesContasReceber> listaModelClientesContasReceber) {
        this.listaModelClientesContasReceber = listaModelClientesContasReceber;
    }
    
}
