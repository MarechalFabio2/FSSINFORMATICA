/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DaoProdutos;
import java.util.ArrayList;
import model.ModelProdutos;

/**
 *
 * @author Fabio
 */
public class ControllerProdutos {

    private DaoProdutos daoProdutos = new DaoProdutos();

    /**
     * Salvar produtos controller
     *
     * @param pModelProdutos
     * @return int
     */
    public int salvarProdutoController(ModelProdutos pModelProdutos) {
        return this.daoProdutos.salvarProdutosDAO(pModelProdutos);
    }

    /**
     * Excluir produtos controller
     *
     * @param pCodigo
     * @return boolean
     */
    public boolean excluirProdutoController(int pCodigo) {
        return this.daoProdutos.excluirProdutoDAO(pCodigo);
    }

    /**
     * Alterar produto
     *
     * @param pModelProdutos
     * @return boolean
     */
    public boolean alterarProdutoController(ModelProdutos pModelProdutos) {
        return this.daoProdutos.alterarProdutoDAO(pModelProdutos);
    }

    /**
     * Retornar Produto
     *
     * @param pProduto
     * @return model produtos
     */
    public ModelProdutos retornarIdProdutoController(int pProduto) {
        return this.daoProdutos.retornarIdProdutoDAO(pProduto);
    }

    /**
     * Retornar Produto
     *
     * @param pNomeProduto
     * @return model produtos
     */
    public ModelProdutos retornarNomeProdutoController(String pNomeProduto) {
        return this.daoProdutos.retornarNomeProdutoDAO(pNomeProduto);
    }

    /**
     * Retornar uma Lista de Produtos
     *
     * @return lista Model Produtos
     */
    public ArrayList<ModelProdutos> retornarListaProdutoController() {
        return this.daoProdutos.retornarListaProdutosDAO();
    }

    /**
     * alterar lista de produtos no banco
     *
     * @param pListaModelProdutos
     * @return
     **/
    public boolean alterarEstoqueProdutoVendaController(ArrayList<ModelProdutos> pListaModelProdutos) {
        return this.daoProdutos.alterarEstoqueProdutoVendaDAO(pListaModelProdutos);
    }
    
    /**
     * alterar lista de produtos no banco
     *
     * @param pListaModelProdutos
     * @return
     **/
    public boolean alterarEstoqueProdutoCompraController(ArrayList<ModelProdutos> pListaModelProdutos) {
        return this.daoProdutos.alterarEstoqueProdutoCompraDAO(pListaModelProdutos);
    }
}
