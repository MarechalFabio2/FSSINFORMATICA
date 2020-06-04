/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOVendasFormaPagamento;
import java.util.ArrayList;
import model.ModelVendasFormaPagamento;

/**
 *
 * @author Veronica
 */
public class ControllerVendasFormaPagamento {
    
    private DAOVendasFormaPagamento dAOVendasFormaPagamento= new DAOVendasFormaPagamento();

    public ArrayList<ModelVendasFormaPagamento> getListaVendasFormaPagamentoController() {
        return this.dAOVendasFormaPagamento.getListaVendasFormaPagamentoDAO();
    }
    
}
