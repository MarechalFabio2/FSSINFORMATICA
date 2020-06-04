/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelProdutos;

/**
 *
 * @author Fabio
 */
public class DaoProdutos extends ConexaoMySql {

    /**
     * Cadastrar um produto no banco
     *
     * @param pModelProdutos
     * @return
     */
    public int salvarProdutosDAO(ModelProdutos pModelProdutos) {
        try {
            this.conectar();
            return this.insertSQL(
                    "TB_PRODUTO",
                    "INSERT INTO tb_produto ("
                    + "fk_fornecedor, "
                    + "pro_nome, "
                    + "pro_valor, "
                    + "pro_valor_venda, "
                    + "pro_estoque"
                    + ") VALUES ("
                    + "'" + pModelProdutos.getFkFornecedor() + "',"
                    + "'" + pModelProdutos.getProNome() + "',"
                    + "'" + pModelProdutos.getProValor() + "',"
                    + "'" + pModelProdutos.getProValorVenda() + "',"
                    + "'" + pModelProdutos.getProEstoque() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * Excluir o produto do banco
     *
     * @param pIdProduto
     * @return
     */
    public boolean excluirProdutoDAO(int pIdProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tb_produto WHERE pk_id_produto = '" + pIdProduto + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Alterar dados do produto
     *
     * @param pModelProdutos
     * @return
     */
    public boolean alterarProdutoDAO(ModelProdutos pModelProdutos) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tb_produto SET "
                    + "fk_fornecedor = '" + pModelProdutos.getFkFornecedor() + "',"
                    + "pro_nome = '" + pModelProdutos.getProNome() + "',"
                    + "pro_valor = '" + pModelProdutos.getProValor() + "',"
                    + "pro_valor_venda = '" + pModelProdutos.getProValorVenda() + "',"
                    + "pro_estoque = '" + pModelProdutos.getProEstoque() + "'"
                    + "WHERE pk_id_produto = '" + pModelProdutos.getIdProduto() + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Retornar produto pelo codigo
     *
     * @param pIdProduto
     * @return modelProduto
     */
    public ModelProdutos retornarIdProdutoDAO(int pIdProduto) {
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "fk_fornecedor, "
                    + "pk_id_produto, "
                    + "pro_nome, "
                    + "pro_valor, "
                    + "pro_valor_venda, "
                    + "pro_estoque "
                    + "FROM tb_Produto WHERE pk_id_produto = '" + pIdProduto + "'");
            while (this.getResultSet().next()) {
                modelProdutos.setFkFornecedor(this.getResultSet().getInt(1));
                modelProdutos.setIdProduto(this.getResultSet().getInt(2));
                modelProdutos.setProNome(this.getResultSet().getString(3));
                modelProdutos.setProValor(this.getResultSet().getDouble(4));
                modelProdutos.setProValorVenda(this.getResultSet().getDouble(5));
                modelProdutos.setProEstoque(this.getResultSet().getInt(6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelProdutos;
    }

    /**
     * Retornar produto pelo nome
     *
     * @param pNomeProduto
     * @return modelProduto
     */
    public ModelProdutos retornarNomeProdutoDAO(String pNomeProduto) {
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_produto, "
                    + "pro_nome, "
                    + "pro_valor, "
                    + "pro_valor_venda, "
                    + "pro_estoque, "
                    + "fk_fornecedor "
                    + "FROM tb_Produto WHERE pro_nome = '" + pNomeProduto + "'");
            while (this.getResultSet().next()) {
                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setProNome(this.getResultSet().getString(2));
                modelProdutos.setProValor(this.getResultSet().getDouble(3));
                modelProdutos.setProValorVenda(this.getResultSet().getDouble(4));
                modelProdutos.setProEstoque(this.getResultSet().getInt(5));
                modelProdutos.setFkFornecedor(this.getResultSet().getInt(6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelProdutos;
    }

    /**
     * Retornar uma lista completa de produtos
     *
     * @return ListaModelProdutos
     */
    public ArrayList<ModelProdutos> retornarListaProdutosDAO() {
        ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_produto, "
                    + "pro_nome, "
                    + "pro_estoque, "
                    + "pro_valor_venda, "
                    + "pro_valor, "
                    + "fk_fornecedor "
                    + "FROM tb_produto");

            while (this.getResultSet().next()) {
                modelProdutos = new ModelProdutos();
                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setProNome(this.getResultSet().getString(2));
                modelProdutos.setProEstoque(this.getResultSet().getInt(3));
                modelProdutos.setProValorVenda(this.getResultSet().getDouble(4));
                modelProdutos.setProValor(this.getResultSet().getDouble(5));
                modelProdutos.setFkFornecedor(this.getResultSet().getInt(6));
                listaModelProdutos.add(modelProdutos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaModelProdutos;
    }

    /**
     * alterar estoque de produtos no banco
     *
     * @param pListaModelProdutos
     * @return
     */
    public boolean alterarEstoqueProdutoVendaDAO(ArrayList<ModelProdutos> pListaModelProdutos) {
        try {
            this.conectar();
            for (int i = 0; i < pListaModelProdutos.size(); i++) {

                this.executarUpdateDeleteSQL(
                        "UPDATE tb_produto SET "
                        + "pro_estoque = '" + pListaModelProdutos.get(i).getProEstoque() + "'"
                        + "WHERE pk_id_produto = '" + pListaModelProdutos.get(i).getIdProduto() + "'"
                );
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * alterar estoque de produtos no banco
     *
     * @param pListaModelProdutos
     * @return
     */
    public boolean alterarEstoqueProdutoCompraDAO(ArrayList<ModelProdutos> pListaModelProdutos) {

        try {
            this.conectar();
            for (int i = 0; i < pListaModelProdutos.size(); i++) {

                this.executarUpdateDeleteSQL(
                    "UPDATE tb_produto SET "
                    + "pro_valor = '" + pListaModelProdutos.get(i).getProValor() + "',"
                    + "pro_estoque = '" + pListaModelProdutos.get(i).getProEstoque() + "'"
                    + "WHERE pk_id_produto = '" + pListaModelProdutos.get(i).getIdProduto() + "'"
                );
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
