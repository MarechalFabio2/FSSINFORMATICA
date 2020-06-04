/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOClientesContasReceber;
import java.util.ArrayList;
import model.ModelClientesContasReceber;

/**
 *
 * @author Fabio
 */
public class ControllerClienteContasReceber {
    
    private DAOClientesContasReceber dAOClientesContasReceber = new DAOClientesContasReceber();

    public ArrayList<ModelClientesContasReceber> getListaClienteContasReceberController(int pCodigoContaReceber) {
        return this.dAOClientesContasReceber.getListaClientesContasReceberDAO(pCodigoContaReceber);
    }
    
    public ArrayList<ModelClientesContasReceber> getListaClienteContasReceberController2() {
        return this.dAOClientesContasReceber.getListaClientesContasReceberDAO2();
    }
    
    public ArrayList<ModelClientesContasReceber> getListaClienteContasRecebidasController2() {
        return this.dAOClientesContasReceber.getListaClientesContasRecebidasDAO2();
    }
    
    public ArrayList<ModelClientesContasReceber> getListaClienteContasRecebidasController(int pCodigoContaRecebidas) {
        return this.dAOClientesContasReceber.getListaClientesContasRecebidasDAO(pCodigoContaRecebidas);
    }
    
}
