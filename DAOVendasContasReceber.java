/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelContasReceber;
import model.ModelVendas;
import model.ModelVendasContasReceber;
import util.BLDatas;

/**
 *
 * @author Fabio
 */
public class DAOVendasContasReceber extends ConexaoMySql {
    
    BLDatas bLDatas = new BLDatas();
        
    public ArrayList<ModelVendasContasReceber> getListaVendasContasReceberDAO() {
        ArrayList<ModelVendasContasReceber> listaModelVendasContasReceber = new ArrayList();
        ModelContasReceber modelContasReceber = new ModelContasReceber();
        ModelVendas modelVendas = new ModelVendas();
        ModelVendasContasReceber modelVendasContasReceber = new ModelVendasContasReceber();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "tb_contas_receber.pk_id_contas_receber,"
                    + "tb_contas_receber.fk_cliente,"
                    + "tb_contas_receber.fk_forma_pagamento,"
                    + "tb_contas_receber.fk_venda,"
                    + "tb_contas_receber.descricao_contas_receber,"
                    + "tb_contas_receber.data_contas_receber,"
                    + "tb_contas_receber.vencimento_contas_receber,"
                    + "tb_contas_receber.pagamento_contas_receber,"
                    + "tb_contas_receber.valor_contas_receber,"
                    + "tb_contas_receber.situacao_contas_receber,"
                    + "tb_contas_receber.obs_contas_receber,"
                    + "tb_vendas.pk_id_vendas, "
                    + "tb_vendas.fk_cliente, "
                    + "tb_vendas.fk_forma_pagamento, "
                    + "tb_vendas.ven_data_venda, "
                    + "tb_vendas.ven_valor_liquido, "
                    + "tb_vendas.ven_valor_bruto, "
                    + "tb_vendas.ven_desconto "
                    + " FROM"
                    + " tb_contas_receber INNER JOIN tb_vendas "
                    + "ON tb_vendas.pk_id_vendas = tb_contas_receber.fk_venda; "
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelContasReceber  = new ModelContasReceber();
                modelVendas = new ModelVendas();
                modelVendasContasReceber = new ModelVendasContasReceber();
                //Contas a receber
                modelContasReceber.setIdContasReceber(this.getResultSet().getInt(1));
                modelContasReceber.setFkCliente(this.getResultSet().getInt(2));
                modelContasReceber.setFkPagamento(this.getResultSet().getInt(3));
                modelContasReceber.setFkVenda(this.getResultSet().getInt(4));
                modelContasReceber.setDescricaoContasReceber(this.getResultSet().getString(5));
                modelContasReceber.setDataContasReceber(bLDatas.converterDataParaDateUS(this.getResultSet().getDate(6)));
                modelContasReceber.setVencimentoContasReceber(bLDatas.converterDataParaDateUS(this.getResultSet().getDate(7)));
                modelContasReceber.setPagamentoContasReceber(bLDatas.converterDataParaDateUS(this.getResultSet().getDate(8)));
                modelContasReceber.setValorContasReceber(this.getResultSet().getDouble(9));
                modelContasReceber.setSituaçãoContasReceber(this.getResultSet().getInt(10));
                modelContasReceber.setObservacaoContasReceber(this.getResultSet().getString(11));
                //cliente
                modelVendas.setIdVenda(this.getResultSet().getInt(12));
                modelVendas.setIdVenda(this.getResultSet().getInt(13));
                modelVendas.setFormaPagamento(this.getResultSet().getInt(14));
                modelVendas.setVenDataVenda(this.getResultSet().getDate(15));
                modelVendas.setVenValorLiquido(this.getResultSet().getDouble(16));
                modelVendas.setVenValorBruto(this.getResultSet().getDouble(17));
                modelVendas.setVenValorDesconto(this.getResultSet().getDouble(18));

                modelVendasContasReceber.setModelContasReceber(modelContasReceber);
                modelVendasContasReceber.setModelVendas(modelVendas);

                listaModelVendasContasReceber.add(modelVendasContasReceber);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaModelVendasContasReceber;
    }
    
    public ModelVendasContasReceber getVendasContasReceberDAO(int pCodigo) {
        ModelContasReceber modelContasReceber = new ModelContasReceber();
        ModelVendas modelVendas = new ModelVendas();
        ModelVendasContasReceber modelVendasContasReceber = new ModelVendasContasReceber();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "tb_contas_receber.vencimento_contas_receber"
                    + " FROM"
                    + " tb_contas_receber INNER JOIN tb_vendas "
                    + "ON tb_vendas.pk_id_vendas = tb_contas_receber.fk_venda "
                    + "WHERE tb_vendas.pk_id_vendas = '" + pCodigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelContasReceber  = new ModelContasReceber();
                modelVendas = new ModelVendas();
                modelVendasContasReceber = new ModelVendasContasReceber();
                //Contas a receber
                modelContasReceber.setVencimentoContasReceber(bLDatas.converterDataParaDateUS(this.getResultSet().getDate(1)));
                
                modelVendasContasReceber.setModelContasReceber(modelContasReceber);
                modelVendasContasReceber.setModelVendas(modelVendas);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelVendasContasReceber;
    }
    
}
