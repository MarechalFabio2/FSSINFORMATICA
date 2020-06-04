package controller;

import model.ModelParcelas;
import DAO.DAOParcelas;
import java.util.ArrayList;

/**
*
* @author Fabio
*/
public class ControllerParcelas {

    private DAOParcelas daoParcelas = new DAOParcelas();

    /**
    * grava Parcelas
    * @param pModelParcelas
    * @return int
    */
    public int salvarParcelasController(ModelParcelas pModelParcelas){
        return this.daoParcelas.salvarParcelasDAO(pModelParcelas);
    }

    /**
    * recupera Parcelas
    * @param pIDParcela
    * @return ModelParcelas
    */
    public ModelParcelas getParcelasController(int pIDParcela){
        return this.daoParcelas.getParcelasDAO(pIDParcela);
    }

    /**
    * recupera uma lista deParcelas
    * @param pIDParcela
    * @return ArrayList
    */
    public ArrayList<ModelParcelas> getListaParcelasController(){
        return this.daoParcelas.getListaParcelasDAO();
    }

    /**
    * atualiza Parcelas
    * @param pModelParcelas
    * @return boolean
    */
    public boolean atualizarParcelasController(ModelParcelas pModelParcelas){
        return this.daoParcelas.atualizarParcelasDAO(pModelParcelas);
    }

    /**
    * exclui Parcelas
    * @param pIDParcela
    * @return boolean
    */
    public boolean excluirParcelasController(int pIDParcela){
        return this.daoParcelas.excluirParcelasDAO(pIDParcela);
    }

    public boolean salvarParcelasController(ArrayList<ModelParcelas> pListaModelParcelas) {
        return this.daoParcelas.salvarParcelasDAO(pListaModelParcelas);
    }
}