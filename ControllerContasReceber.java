package controller;

import model.ModelContasReceber;
import DAO.DAOContasReceber;
import java.util.ArrayList;

/**
*
* @author Fabio
*/
public class ControllerContasReceber {

    private DAOContasReceber daoContasReceber = new DAOContasReceber();

    /**
    * grava ContasReceber
    * @param pModelContasReceber
    * return int
    */
    public int salvarContasReceberController(ModelContasReceber pModelContasReceber){
        return this.daoContasReceber.salvarContasReceberDAO(pModelContasReceber);
    }

    /**
    * recupera ContasReceber
    * @param pIdContasReceber
    * return ModelContasReceber
    */
    public ModelContasReceber getContasReceberController(String pIdContasReceber){
        return this.daoContasReceber.getContasReceberDAO(pIdContasReceber);
    }

    /**
    * recupera uma lista deContasReceber
    * @param pIdContasReceber
    * return ArrayList
    */
    public ArrayList<ModelContasReceber> getListaContasReceberController(){
        return this.daoContasReceber.getListaContasReceberDAO();
    }

    /**
    * atualiza ContasReceber
    * @param pModelContasReceber
    * return boolean
    */
    public boolean atualizarContasReceberController(ModelContasReceber pModelContasReceber){
        return this.daoContasReceber.atualizarContasReceberDAO(pModelContasReceber);
    }
    
    /**
    * atualiza para ContasRecebidas
    * @param pModelContasReceber
    * return boolean
    */
    public boolean atualizarContasRecebidasController(ModelContasReceber pModelContasReceber){
        return this.daoContasReceber.atualizarContasRecebidasDAO(pModelContasReceber);
    }
    
    /**
    * atualiza para ContasReceber
    * @param pModelContasReceber
    * return boolean
    */
    public boolean atualizarContasReceberController2(ModelContasReceber pModelContasReceber){
        return this.daoContasReceber.atualizarContasReceberDAO2(pModelContasReceber);
    }

    /**
    * exclui ContasReceber
    * @param pIdContasReceber
    * return boolean
    */
    public boolean excluirContasReceberController(int pIdContasReceber){
        return this.daoContasReceber.excluirContasReceberDAO(pIdContasReceber);
    }
    
    /**
    * exclui ContasReceber
    * @param pIdVendaContasReceber
    * return boolean
    */
    public boolean excluirContasReceberControllerVenda(int pIdVendaContasReceber){
        return this.daoContasReceber.excluirContasReceberDAOVenda(pIdVendaContasReceber);
    }

    public ArrayList<ModelContasReceber> getListaContasRecebidasController(int pIdContaReceber) {
        return this.daoContasReceber.getListaContasRecebidasDAO(pIdContaReceber);
    }
    
    public ArrayList<ModelContasReceber> getListaContasReceberController(int pIdContaReceber) {
        return this.daoContasReceber.getListaContasReceberDAO(pIdContaReceber);
    }

}