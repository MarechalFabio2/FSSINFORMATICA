/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelFormaPagamento;
import model.ModelVendas;
import model.ModelVendasFormaPagamento;

/**
 *
 * @author Fabio
 */
public class DAOVendasFormaPagamento extends ConexaoMySql{
    
    public ArrayList<ModelVendasFormaPagamento> getListaVendasFormaPagamentoDAO() {
        ArrayList<ModelVendasFormaPagamento> listaModelVendasFormaPagamento = new ArrayList();
        ModelVendas modelVendas = new ModelVendas();
        ModelFormaPagamento modelFormaPagamento = new ModelFormaPagamento();
        ModelVendasFormaPagamento modelVendasFormaPagamento = new ModelVendasFormaPagamento();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "tb_vendas.pk_id_vendas,"
                    + "tb_vendas.fk_cliente,"
                    + "tb_vendas.ven_data_venda,"
                    + "tb_vendas.ven_valor_liquido,"
                    + "tb_vendas.ven_valor_bruto,"
                    + "tb_vendas.ven_desconto,"
                    + "tb_forma_pagamento.pk_id_forma_pagamento, "
                    + "tb_forma_pagamento.descricao_forma_pagamento, "
                    + "tb_forma_pagamento.desconto_forma_pagamento, "
                    + "tb_forma_pagamento.parcela_forma_pagamento, "
                    + "tb_forma_pagamento.situacao_forma_pagamento, "
                    + " FROM"
                    + " tb_vendas INNER JOIN tb_cliente "
                    + "ON tb_forma_pagamento.pk_id_forma_pagamento = tb_vendas.fk_forma_pagamento; "
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVendas = new ModelVendas();
                modelFormaPagamento = new ModelFormaPagamento();
                modelVendasFormaPagamento = new ModelVendasFormaPagamento();
                //vendas
                modelVendas.setIdVenda(this.getResultSet().getInt(1));
                modelVendas.setCliente(this.getResultSet().getInt(2));
                modelVendas.setVenDataVenda(this.getResultSet().getDate(3));
                modelVendas.setVenValorLiquido(this.getResultSet().getDouble(4));
                modelVendas.setVenValorBruto(this.getResultSet().getDouble(5));
                modelVendas.setVenValorDesconto(this.getResultSet().getDouble(6));
                //cliente
                modelFormaPagamento.setIdFormaPagamento(this.getResultSet().getInt(7));
                modelFormaPagamento.setDescricaoFormaPagamento(this.getResultSet().getString(8));
                modelFormaPagamento.setDescontoFormaPagamento(this.getResultSet().getFloat(9));
                modelFormaPagamento.setParcelaFormaPagamento(this.getResultSet().getInt(10));
                modelFormaPagamento.setSituacaoFormaPagamento(this.getResultSet().getInt(11));

                modelVendasFormaPagamento.setModelVendas(modelVendas);
                modelVendasFormaPagamento.setModelFormaPagamento(modelFormaPagamento);

                listaModelVendasFormaPagamento.add(modelVendasFormaPagamento);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaModelVendasFormaPagamento;
    }

    
    
}
