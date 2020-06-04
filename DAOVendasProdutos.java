package DAO;

import model.ModelVendasProdutos;
import conexoes.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author Fabio
 */
public class DAOVendasProdutos extends ConexaoMySql {

    /**
     * grava VendasProdutos
     *
     * @param pModelVendasProdutos return int
     */
    public int salvarVendasProdutosDAO(ModelVendasProdutos pModelVendasProdutos) {
        try {
            this.conectar();
            return this.insertSQL(
                    "TB_VENDAS_PRODUTOS",
                    "INSERT INTO tb_vendas_produtos ("
                    + "fk_produto,"
                    + "fk_vendas,"
                    + "ven_pro_valor,"
                    + "ven_pro_valor_venda,"
                    + "ven_pro_quantidade"
                    + ") VALUES ("
                    + "'" + pModelVendasProdutos.getProduto() + "',"
                    + "'" + pModelVendasProdutos.getVendas() + "',"
                    + "'" + pModelVendasProdutos.getVenProValor() + "',"
                    + "'" + pModelVendasProdutos.getVenProValorVenda() + "',"
                    + "'" + pModelVendasProdutos.getVenProQuantidade() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * recupera VendasProdutos
     *
     * @param pIdVendaProduto return ModelVendasProdutos
     */
    public ModelVendasProdutos getVendasProdutosDAO(int pIdVendaProduto) {
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_vendas_produto,"
                    + "fk_produto,"
                    + "fk_vendas,"
                    + "ven_pro_valor,"
                    + "ven_pro_valor_venda,"
                    + "ven_pro_quantidade"
                    + " FROM"
                    + " tb_vendas_produtos"
                    + " WHERE"
                    + " pk_id_vendas_produto = '" + pIdVendaProduto + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVendasProdutos.setIdVendaProduto(this.getResultSet().getInt(1));
                modelVendasProdutos.setProduto(this.getResultSet().getInt(2));
                modelVendasProdutos.setVendas(this.getResultSet().getInt(3));
                modelVendasProdutos.setVenProValor(this.getResultSet().getDouble(4));
                modelVendasProdutos.setVenProValorVenda(this.getResultSet().getDouble(5));
                modelVendasProdutos.setVenProQuantidade(this.getResultSet().getInt(6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelVendasProdutos;
    }

    /**
     * recupera uma lista de VendasProdutos return ArrayList
     */
    public ArrayList<ModelVendasProdutos> getListaVendasProdutosDAO() {
        ArrayList<ModelVendasProdutos> listamodelVendasProdutos = new ArrayList();
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_vendas_produto,"
                    + "fk_produto,"
                    + "fk_vendas,"
                    + "ven_pro_valor,"
                    + "ven_pro_valor_venda,"
                    + "ven_pro_quantidade"
                    + " FROM"
                    + " tb_vendas_produtos"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVendasProdutos = new ModelVendasProdutos();
                modelVendasProdutos.setIdVendaProduto(this.getResultSet().getInt(1));
                modelVendasProdutos.setProduto(this.getResultSet().getInt(2));
                modelVendasProdutos.setVendas(this.getResultSet().getInt(3));
                modelVendasProdutos.setVenProValor(this.getResultSet().getDouble(4));
                modelVendasProdutos.setVenProValorVenda(this.getResultSet().getDouble(5));
                modelVendasProdutos.setVenProQuantidade(this.getResultSet().getInt(6));
                listamodelVendasProdutos.add(modelVendasProdutos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listamodelVendasProdutos;
    }

    /**
     * atualiza VendasProdutos
     *
     * @param pModelVendasProdutos return boolean
     */
    public boolean atualizarVendasProdutosDAO(ModelVendasProdutos pModelVendasProdutos) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tb_vendas_produtos SET "
                    + "pk_id_vendas_produto = '" + pModelVendasProdutos.getIdVendaProduto() + "',"
                    + "fk_produto = '" + pModelVendasProdutos.getProduto() + "',"
                    + "fk_vendas = '" + pModelVendasProdutos.getVendas() + "',"
                    + "ven_pro_valor = '" + pModelVendasProdutos.getVenProValor() + "',"
                    + "ven_pro_valor_venda = '" + pModelVendasProdutos.getVenProValorVenda() + "',"
                    + "ven_pro_quantidade = '" + pModelVendasProdutos.getVenProQuantidade() + "'"
                    + " WHERE "
                    + "pk_id_vendas_produto = '" + pModelVendasProdutos.getIdVendaProduto() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * exclui VendasProdutos
     *
     * @param pIdVendaProduto return boolean
     */
    public boolean excluirVendasProdutosDAO(int pIdVendaProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tb_vendas_produtos "
                    + " WHERE "
                    + "fk_vendas = '" + pIdVendaProduto + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Salvar uma lista de produtos de venda
     *
     * @param pListaModelVendasProdutos
     * @return
     */
    public boolean salvarVendasProdutosDAO(ArrayList<ModelVendasProdutos> pListaModelVendasProdutos) {                                                                   
        try {
            this.conectar();
            int cont = pListaModelVendasProdutos.size();
            for (int i = 0; i < cont; i++) {
                this.insertSQL(
                        "TB_VENDAS_PRODUTOS",
                        "INSERT INTO tb_vendas_produtos ("
                        + "fk_produto,"
                        + "fk_vendas,"
                        + "ven_pro_valor,"
                        + "ven_pro_valor_venda,"
                        + "ven_pro_quantidade"
                        + ") VALUES ("
                        + "'" + pListaModelVendasProdutos.get(i).getProduto() + "',"
                        + "'" + pListaModelVendasProdutos.get(i).getVendas() + "',"
                        + "'" + pListaModelVendasProdutos.get(i).getVenProValor() + "',"
                        + "'" + pListaModelVendasProdutos.get(i).getVenProValorVenda() + "',"
                        + "'" + pListaModelVendasProdutos.get(i).getVenProQuantidade() + "'"
                        + " );"
                );
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
