/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelProdutos;
import model.ModelProdutosVendasProdutos;
import model.ModelVendasProdutos;

/**
 *
 * @author Fabio
 */
public class DAOProdutosVendasProdutos extends ConexaoMySql {

    public ArrayList<ModelProdutosVendasProdutos> getListaProdutosVendasProdutosDao(int pCodigoVenda) {
        ArrayList<ModelProdutosVendasProdutos> listaModelProdutosVendasProdutos = new ArrayList<>();
        ModelProdutosVendasProdutos modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
        ModelProdutos modelProdutos = new ModelProdutos();
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "tb_produto.pk_id_produto, "
                    + "tb_produto.pro_estoque, "
                    + "tb_produto.pro_nome, "
                    + "tb_produto.pro_valor, "
                    + "tb_produto.pro_valor_venda, "
                    + "tb_vendas_produtos.fk_produto, "
                    + "tb_vendas_produtos.fk_vendas, "
                    + "tb_vendas_produtos.pk_id_venda_produto, "
                    + "tb_vendas_produtos.ven_pro_quantidade, "
                    + "tb_vendas_produtos.ven_pro_valor, "
                    + "tb_vendas_produtos.ven_pro_valor_venda "
                    + "FROM tb_vendas_produtos "
                    + "INNER JOIN tb_produto "
                    + "ON tb_produto.pk_id_produto = tb_vendas_produtos.fk_produto "
                    + "WHERE tb_vendas_produtos.fk_vendas = '" + pCodigoVenda + "';");

            while (this.getResultSet().next()) {
                modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
                modelProdutos = new ModelProdutos();
                modelVendasProdutos = new ModelVendasProdutos();

                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setProEstoque(this.getResultSet().getInt(2));
                modelProdutos.setProNome(this.getResultSet().getString(3));
                modelProdutos.setProValor(this.getResultSet().getDouble(4));
                modelProdutos.setProValorVenda(this.getResultSet().getDouble(5));

                modelVendasProdutos.setProduto(this.getResultSet().getInt(6));
                modelVendasProdutos.setVendas(this.getResultSet().getInt(7));
                modelVendasProdutos.setIdVendaProduto(this.getResultSet().getInt(8));
                modelVendasProdutos.setVenProQuantidade(this.getResultSet().getInt(9));
                modelVendasProdutos.setVenProValor(this.getResultSet().getDouble(10));
                modelVendasProdutos.setVenProValorVenda(this.getResultSet().getDouble(11));

                modelProdutosVendasProdutos.setModelProdutos(modelProdutos);
                modelProdutosVendasProdutos.setModelVendasProdutos(modelVendasProdutos);

                listaModelProdutosVendasProdutos.add(modelProdutosVendasProdutos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaModelProdutosVendasProdutos;
    }
}
