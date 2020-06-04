/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelCliente;
import model.ModelClientesContasReceber;
import model.ModelContasReceber;
import util.BLDatas;

/**
 *
 * @author Fabio
 */
public class DAOClientesContasReceber extends ConexaoMySql{
    
    BLDatas bLDatas = new BLDatas();
        
    public ArrayList<ModelClientesContasReceber> getListaClientesContasReceberDAO(int pCodigoContaReceber) {
        ArrayList<ModelClientesContasReceber> listaModelClientesContasReceber = new ArrayList();
        ModelContasReceber modelContasReceber = new ModelContasReceber();
        ModelCliente modelCliente = new ModelCliente();
        ModelClientesContasReceber modelClientesContasReceber = new ModelClientesContasReceber();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "tb_contas_receber.pk_id_contas_receber, "
                    + "tb_contas_receber.fk_cliente, "
                    + "tb_contas_receber.fk_forma_pagamento, "
                    + "tb_contas_receber.fk_venda, "
                    + "tb_contas_receber.descricao_contas_receber, "
                    + "tb_contas_receber.data_contas_receber, "
                    + "tb_contas_receber.vencimento_contas_receber, "
                    + "tb_contas_receber.pagamento_contas_receber, "
                    + "tb_contas_receber.valor_contas_receber, "
                    + "tb_contas_receber.situacao_contas_receber, "
                    + "tb_contas_receber.obs_contas_receber, "
                    + "tb_cliente.pk_id_cliente, "
                    + "tb_cliente.cli_nome, "
                    + "tb_cliente.cli_endereco, "
                    + "tb_cliente.cli_bairro, "
                    + "tb_cliente.cli_cidade, "
                    + "tb_cliente.cli_estado, "
                    + "tb_cliente.cli_cep, "
                    + "tb_cliente.cli_telefone "
                    + " FROM"
                    + " tb_cliente INNER JOIN tb_contas_receber "
                    + "ON tb_contas_receber.fk_cliente = tb_cliente.pk_id_cliente "
                    + "AND tb_contas_receber.situacao_contas_receber = 0 "
                    + "AND tb_contas_receber.pagamento_contas_receber is null "
                    + "WHERE tb_contas_receber.pk_id_contas_receber = '" + pCodigoContaReceber + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelContasReceber  = new ModelContasReceber();
                modelCliente = new ModelCliente();
                modelClientesContasReceber = new ModelClientesContasReceber();
                //Contas a receber
                modelContasReceber.setIdContasReceber(this.getResultSet().getInt(1));
                modelContasReceber.setFkCliente(this.getResultSet().getInt(2));
                modelContasReceber.setFkPagamento(this.getResultSet().getInt(3));
                modelContasReceber.setFkVenda(this.getResultSet().getInt(4));
                modelContasReceber.setDescricaoContasReceber(this.getResultSet().getString(5));
                modelContasReceber.setDataContasReceber(this.getResultSet().getDate(6));
                modelContasReceber.setVencimentoContasReceber(this.getResultSet().getDate(7));
                modelContasReceber.setPagamentoContasReceber(this.getResultSet().getDate(8));
                modelContasReceber.setValorContasReceber(this.getResultSet().getDouble(9));
                modelContasReceber.setSituaçãoContasReceber(this.getResultSet().getInt(10));
                modelContasReceber.setObservacaoContasReceber(this.getResultSet().getString(11));
                //cliente
                modelCliente.setIdCliente(this.getResultSet().getInt(12));
                modelCliente.setCliNome(this.getResultSet().getString(13));
                modelCliente.setCliEndereco(this.getResultSet().getString(14));
                modelCliente.setCliBairro(this.getResultSet().getString(15));
                modelCliente.setCliCidade(this.getResultSet().getString(16));
                modelCliente.setCliEstado(this.getResultSet().getString(17));
                modelCliente.setCliCep(this.getResultSet().getString(18));
                modelCliente.setCliTelefone(this.getResultSet().getString(19));

                modelClientesContasReceber.setModelContasReceber(modelContasReceber);
                modelClientesContasReceber.setModelCliente(modelCliente);

                listaModelClientesContasReceber.add(modelClientesContasReceber);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            
        }
        return listaModelClientesContasReceber;
    }
    
    public ArrayList<ModelClientesContasReceber> getListaClientesContasRecebidasDAO(int pCodigoContaRecebidas) {
        ArrayList<ModelClientesContasReceber> listaModelClientesContasReceber = new ArrayList();
        ModelContasReceber modelContasReceber = new ModelContasReceber();
        ModelCliente modelCliente = new ModelCliente();
        ModelClientesContasReceber modelClientesContasReceber = new ModelClientesContasReceber();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "tb_contas_receber.pk_id_contas_receber, "
                    + "tb_contas_receber.fk_cliente, "
                    + "tb_contas_receber.fk_forma_pagamento, "
                    + "tb_contas_receber.fk_venda, "
                    + "tb_contas_receber.descricao_contas_receber, "
                    + "tb_contas_receber.data_contas_receber, "
                    + "tb_contas_receber.vencimento_contas_receber, "
                    + "tb_contas_receber.pagamento_contas_receber, "
                    + "tb_contas_receber.valor_contas_receber, "
                    + "tb_contas_receber.situacao_contas_receber, "
                    + "tb_contas_receber.obs_contas_receber, "
                    + "tb_cliente.pk_id_cliente, "
                    + "tb_cliente.cli_nome, "
                    + "tb_cliente.cli_endereco, "
                    + "tb_cliente.cli_bairro, "
                    + "tb_cliente.cli_cidade, "
                    + "tb_cliente.cli_estado, "
                    + "tb_cliente.cli_cep, "
                    + "tb_cliente.cli_telefone "
                    + " FROM"
                    + " tb_cliente INNER JOIN tb_contas_receber "
                    + "ON tb_contas_receber.fk_cliente = tb_cliente.pk_id_cliente "
                    + "AND tb_contas_receber.situacao_contas_receber = 1 "
                    + "AND tb_contas_receber.pagamento_contas_receber is not null "
                    + "WHERE tb_contas_receber.pk_id_contas_receber = '" + pCodigoContaRecebidas + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelContasReceber  = new ModelContasReceber();
                modelCliente = new ModelCliente();
                modelClientesContasReceber = new ModelClientesContasReceber();
                //Contas a receber
                modelContasReceber.setIdContasReceber(this.getResultSet().getInt(1));
                modelContasReceber.setFkCliente(this.getResultSet().getInt(2));
                modelContasReceber.setFkPagamento(this.getResultSet().getInt(3));
                modelContasReceber.setFkVenda(this.getResultSet().getInt(4));
                modelContasReceber.setDescricaoContasReceber(this.getResultSet().getString(5));
                modelContasReceber.setDataContasReceber(this.getResultSet().getDate(6));
                modelContasReceber.setVencimentoContasReceber(this.getResultSet().getDate(7));
                modelContasReceber.setPagamentoContasReceber(this.getResultSet().getDate(8));
                modelContasReceber.setValorContasReceber(this.getResultSet().getDouble(9));
                modelContasReceber.setSituaçãoContasReceber(this.getResultSet().getInt(10));
                modelContasReceber.setObservacaoContasReceber(this.getResultSet().getString(11));
                //cliente
                modelCliente.setIdCliente(this.getResultSet().getInt(12));
                modelCliente.setCliNome(this.getResultSet().getString(13));
                modelCliente.setCliEndereco(this.getResultSet().getString(14));
                modelCliente.setCliBairro(this.getResultSet().getString(15));
                modelCliente.setCliCidade(this.getResultSet().getString(16));
                modelCliente.setCliEstado(this.getResultSet().getString(17));
                modelCliente.setCliCep(this.getResultSet().getString(18));
                modelCliente.setCliTelefone(this.getResultSet().getString(19));

                modelClientesContasReceber.setModelContasReceber(modelContasReceber);
                modelClientesContasReceber.setModelCliente(modelCliente);

                listaModelClientesContasReceber.add(modelClientesContasReceber);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            
        }
        return listaModelClientesContasReceber;
    }
    
    public ArrayList<ModelClientesContasReceber> getListaClientesContasReceberDAO2() {
        ArrayList<ModelClientesContasReceber> listaModelClientesContasReceber = new ArrayList();
        ModelContasReceber modelContasReceber = new ModelContasReceber();
        ModelCliente modelCliente = new ModelCliente();
        ModelClientesContasReceber modelClientesContasReceber = new ModelClientesContasReceber();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "tb_contas_receber.pk_id_contas_receber, "
                    + "tb_contas_receber.fk_cliente, "
                    + "tb_contas_receber.fk_forma_pagamento, "
                    + "tb_contas_receber.fk_venda, "
                    + "tb_contas_receber.descricao_contas_receber, "
                    + "tb_contas_receber.data_contas_receber, "
                    + "tb_contas_receber.vencimento_contas_receber, "
                    + "tb_contas_receber.pagamento_contas_receber, "
                    + "tb_contas_receber.valor_contas_receber, "
                    + "tb_contas_receber.situacao_contas_receber, "
                    + "tb_contas_receber.obs_contas_receber, "
                    + "tb_cliente.pk_id_cliente, "
                    + "tb_cliente.cli_nome, "
                    + "tb_cliente.cli_endereco, "
                    + "tb_cliente.cli_bairro, "
                    + "tb_cliente.cli_cidade, "
                    + "tb_cliente.cli_estado, "
                    + "tb_cliente.cli_cep, "
                    + "tb_cliente.cli_telefone "
                    + " FROM"
                    + " tb_cliente INNER JOIN tb_contas_receber "
                    + "ON tb_contas_receber.fk_cliente = tb_cliente.pk_id_cliente "
                    + "AND tb_contas_receber.situacao_contas_receber = 0 "
                    + "AND tb_contas_receber.pagamento_contas_receber is null"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelContasReceber  = new ModelContasReceber();
                modelCliente = new ModelCliente();
                modelClientesContasReceber = new ModelClientesContasReceber();
                //Contas a receber
                modelContasReceber.setIdContasReceber(this.getResultSet().getInt(1));
                modelContasReceber.setFkCliente(this.getResultSet().getInt(2));
                modelContasReceber.setFkPagamento(this.getResultSet().getInt(3));
                modelContasReceber.setFkVenda(this.getResultSet().getInt(4));
                modelContasReceber.setDescricaoContasReceber(this.getResultSet().getString(5));
                modelContasReceber.setDataContasReceber(this.getResultSet().getDate(6));
                modelContasReceber.setVencimentoContasReceber(this.getResultSet().getDate(7));
                modelContasReceber.setPagamentoContasReceber(this.getResultSet().getDate(8));
                modelContasReceber.setValorContasReceber(this.getResultSet().getDouble(9));
                modelContasReceber.setSituaçãoContasReceber(this.getResultSet().getInt(10));
                modelContasReceber.setObservacaoContasReceber(this.getResultSet().getString(11));
                //cliente
                modelCliente.setIdCliente(this.getResultSet().getInt(12));
                modelCliente.setCliNome(this.getResultSet().getString(13));
                modelCliente.setCliEndereco(this.getResultSet().getString(14));
                modelCliente.setCliBairro(this.getResultSet().getString(15));
                modelCliente.setCliCidade(this.getResultSet().getString(16));
                modelCliente.setCliEstado(this.getResultSet().getString(17));
                modelCliente.setCliCep(this.getResultSet().getString(18));
                modelCliente.setCliTelefone(this.getResultSet().getString(19));

                modelClientesContasReceber.setModelContasReceber(modelContasReceber);
                modelClientesContasReceber.setModelCliente(modelCliente);

                listaModelClientesContasReceber.add(modelClientesContasReceber);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            
        }
        return listaModelClientesContasReceber;
    }
    
    public ArrayList<ModelClientesContasReceber> getListaClientesContasRecebidasDAO2() {
        ArrayList<ModelClientesContasReceber> listaModelClientesContasReceber = new ArrayList();
        ModelContasReceber modelContasReceber = new ModelContasReceber();
        ModelCliente modelCliente = new ModelCliente();
        ModelClientesContasReceber modelClientesContasReceber = new ModelClientesContasReceber();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "tb_contas_receber.pk_id_contas_receber, "
                    + "tb_contas_receber.fk_cliente, "
                    + "tb_contas_receber.fk_forma_pagamento, "
                    + "tb_contas_receber.fk_venda, "
                    + "tb_contas_receber.descricao_contas_receber, "
                    + "tb_contas_receber.data_contas_receber, "
                    + "tb_contas_receber.vencimento_contas_receber, "
                    + "tb_contas_receber.pagamento_contas_receber, "
                    + "tb_contas_receber.valor_contas_receber, "
                    + "tb_contas_receber.situacao_contas_receber, "
                    + "tb_contas_receber.obs_contas_receber, "
                    + "tb_cliente.pk_id_cliente, "
                    + "tb_cliente.cli_nome, "
                    + "tb_cliente.cli_endereco, "
                    + "tb_cliente.cli_bairro, "
                    + "tb_cliente.cli_cidade, "
                    + "tb_cliente.cli_estado, "
                    + "tb_cliente.cli_cep, "
                    + "tb_cliente.cli_telefone "
                    + " FROM"
                    + " tb_cliente INNER JOIN tb_contas_receber "
                    + "ON tb_contas_receber.fk_cliente = tb_cliente.pk_id_cliente "
                    + "AND tb_contas_receber.situacao_contas_receber = 1 "
                    + "AND tb_contas_receber.pagamento_contas_receber is not null"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelContasReceber  = new ModelContasReceber();
                modelCliente = new ModelCliente();
                modelClientesContasReceber = new ModelClientesContasReceber();
                //Contas a receber
                modelContasReceber.setIdContasReceber(this.getResultSet().getInt(1));
                modelContasReceber.setFkCliente(this.getResultSet().getInt(2));
                modelContasReceber.setFkPagamento(this.getResultSet().getInt(3));
                modelContasReceber.setFkVenda(this.getResultSet().getInt(4));
                modelContasReceber.setDescricaoContasReceber(this.getResultSet().getString(5));
                modelContasReceber.setDataContasReceber(this.getResultSet().getDate(6));
                modelContasReceber.setVencimentoContasReceber(this.getResultSet().getDate(7));
                modelContasReceber.setPagamentoContasReceber(this.getResultSet().getDate(8));
                modelContasReceber.setValorContasReceber(this.getResultSet().getDouble(9));
                modelContasReceber.setSituaçãoContasReceber(this.getResultSet().getInt(10));
                modelContasReceber.setObservacaoContasReceber(this.getResultSet().getString(11));
                //cliente
                modelCliente.setIdCliente(this.getResultSet().getInt(12));
                modelCliente.setCliNome(this.getResultSet().getString(13));
                modelCliente.setCliEndereco(this.getResultSet().getString(14));
                modelCliente.setCliBairro(this.getResultSet().getString(15));
                modelCliente.setCliCidade(this.getResultSet().getString(16));
                modelCliente.setCliEstado(this.getResultSet().getString(17));
                modelCliente.setCliCep(this.getResultSet().getString(18));
                modelCliente.setCliTelefone(this.getResultSet().getString(19));

                modelClientesContasReceber.setModelContasReceber(modelContasReceber);
                modelClientesContasReceber.setModelCliente(modelCliente);

                listaModelClientesContasReceber.add(modelClientesContasReceber);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            
        }
        return listaModelClientesContasReceber;
    }
    
    public ModelClientesContasReceber geClientesContasRecebidasDAO(int pCodigo) {
        ModelContasReceber modelContasReceber = new ModelContasReceber();
        ModelCliente modelCliente = new ModelCliente();
        ModelClientesContasReceber modelClientesContasReceber = new ModelClientesContasReceber();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "tb_contas_receber.pk_id_contas_receber, "
                    + "tb_contas_receber.fk_cliente, "
                    + "tb_contas_receber.fk_forma_pagamento, "
                    + "tb_contas_receber.fk_venda, "
                    + "tb_contas_receber.descricao_contas_receber, "
                    + "tb_contas_receber.data_contas_receber, "
                    + "tb_contas_receber.vencimento_contas_receber, "
                    + "tb_contas_receber.pagamento_contas_receber, "
                    + "tb_contas_receber.valor_contas_receber, "
                    + "tb_contas_receber.situacao_contas_receber, "
                    + "tb_contas_receber.obs_contas_receber, "
                    + "tb_cliente.pk_id_cliente, "
                    + "tb_cliente.cli_nome, "
                    + "tb_cliente.cli_endereco, "
                    + "tb_cliente.cli_bairro, "
                    + "tb_cliente.cli_cidade, "
                    + "tb_cliente.cli_estado, "
                    + "tb_cliente.cli_cep, "
                    + "tb_cliente.cli_telefone "
                    + " FROM"
                    + " tb_cliente INNER JOIN tb_contas_receber "
                    + "ON tb_contas_receber.fk_cliente = tb_cliente.pk_id_cliente "
                    + "AND tb_contas_receber.situacao_contas_receber = 1 "
                    + "AND tb_contas_receber.pagamento_contas_receber is not null"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelContasReceber  = new ModelContasReceber();
                modelCliente = new ModelCliente();
                modelClientesContasReceber = new ModelClientesContasReceber();
                //Contas a receber
                modelContasReceber.setIdContasReceber(this.getResultSet().getInt(1));
                modelContasReceber.setFkCliente(this.getResultSet().getInt(2));
                modelContasReceber.setFkPagamento(this.getResultSet().getInt(3));
                modelContasReceber.setFkVenda(this.getResultSet().getInt(4));
                modelContasReceber.setDescricaoContasReceber(this.getResultSet().getString(5));
                modelContasReceber.setDataContasReceber(this.getResultSet().getDate(6));
                modelContasReceber.setVencimentoContasReceber(this.getResultSet().getDate(7));
                modelContasReceber.setPagamentoContasReceber(this.getResultSet().getDate(8));
                modelContasReceber.setValorContasReceber(this.getResultSet().getDouble(9));
                modelContasReceber.setSituaçãoContasReceber(this.getResultSet().getInt(10));
                modelContasReceber.setObservacaoContasReceber(this.getResultSet().getString(11));
                //cliente
                modelCliente.setIdCliente(this.getResultSet().getInt(12));
                modelCliente.setCliNome(this.getResultSet().getString(13));
                modelCliente.setCliEndereco(this.getResultSet().getString(14));
                modelCliente.setCliBairro(this.getResultSet().getString(15));
                modelCliente.setCliCidade(this.getResultSet().getString(16));
                modelCliente.setCliEstado(this.getResultSet().getString(17));
                modelCliente.setCliCep(this.getResultSet().getString(18));
                modelCliente.setCliTelefone(this.getResultSet().getString(19));

                modelClientesContasReceber.setModelContasReceber(modelContasReceber);
                modelClientesContasReceber.setModelCliente(modelCliente);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            
        }
        return modelClientesContasReceber;
    }
    
}
