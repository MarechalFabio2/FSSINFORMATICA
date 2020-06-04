/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOVendasContasReceber;
import java.util.ArrayList;
import model.ModelVendasContasReceber;

/**
 *
 * @author Fabio
 */
public class ControllerVendasContasReceber {
    
    private DAOVendasContasReceber dAOVendasContasReceber = new DAOVendasContasReceber();

    public ArrayList<ModelVendasContasReceber> getListaVendasContasReceberController() {
        return this.dAOVendasContasReceber.getListaVendasContasReceberDAO();
    }
    
    public ModelVendasContasReceber getVendasContasReceberController(int pCodigo) {
        return this.dAOVendasContasReceber.getVendasContasReceberDAO(pCodigo);
    }
    
}
