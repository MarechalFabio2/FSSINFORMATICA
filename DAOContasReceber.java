package DAO;

import model.ModelContasReceber;
import conexoes.ConexaoMySql;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Fabio
 */
public class DAOContasReceber extends ConexaoMySql {

    /**
     * grava ContasReceber
     *
     * @param pModelContasReceber return int
     */
    public int salvarContasReceberDAO(ModelContasReceber pModelContasReceber) {
        try {
            this.conectar();

            Date pagamento = pModelContasReceber.getPagamentoContasReceber();
            String strPagamento = "null";
            if (pagamento != null) {
                strPagamento = "'" + pagamento + "'";
            }
            
            Date vencimento = pModelContasReceber.getVencimentoContasReceber();
            String strVencimento = "null";
            if (vencimento != null) {
                strVencimento = "'" + vencimento + "'";
            }

            return this.insertSQL(
                    "TB_CONTAS_RECEBER",
                    "INSERT INTO tb_contas_receber ("
                    + "fk_cliente,"
                    + "fk_forma_pagamento,"
                    + "fk_venda,"
                    + "descricao_contas_receber,"
                    + "data_contas_receber,"
                    + "vencimento_contas_receber,"
                    + "pagamento_contas_receber,"
                    + "valor_contas_receber,"
                    + "situacao_contas_receber,"
                    + "obs_contas_receber,"
                    + "rec_parcelas"        
                    + ") VALUES ("
                    + "'" + pModelContasReceber.getFkCliente() + "',"
                    + "'" + pModelContasReceber.getFkPagamento() + "',"
                    + "'" + pModelContasReceber.getFkVenda() + "',"
                    + "'" + pModelContasReceber.getDescricaoContasReceber() + "',"
                    + "'" + pModelContasReceber.getDataContasReceber() + "',"
                    + strVencimento + ","
                    + strPagamento + ","
                    + "'" + pModelContasReceber.getValorContasReceber() + "',"
                    + "'" + pModelContasReceber.getSituaçãoContasReceber() + "',"
                    + "'" + pModelContasReceber.getObservacaoContasReceber() + "',"
                    + "'" + pModelContasReceber.getNumeroParcelas() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    /**
     * recupera ContasReceber
     *
     * @param pIdContasReceber return ModelContasReceber
     */
    public ModelContasReceber getContasReceberDAO(String pIdContasReceber) {
        ModelContasReceber modelContasReceber = new ModelContasReceber();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_contas_receber,"
                    + "fk_cliente,"
                    + "fk_forma_pagamento,"
                    + "fk_venda,"
                    + "descricao_contas_receber,"
                    + "data_contas_receber,"
                    + "vencimento_contas_receber,"
                    + "pagamento_contas_receber,"
                    + "valor_contas_receber,"
                    + "situacao_contas_receber,"
                    + "obs_contas_receber,"
                    + "rec_parcelas"         
                    + " FROM"
                    + " tb_contas_receber"
                    + " WHERE situacao_contas_receber = 0 AND "
                    + " pk_id_contas_receber = '" + pIdContasReceber + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
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
                modelContasReceber.setNumeroParcelas(this.getResultSet().getInt(12));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelContasReceber;
    }

    /**
     * recupera uma lista de ContasReceber return ArrayList
     */
    public ArrayList<ModelContasReceber> getListaContasReceberDAO() {
        ArrayList<ModelContasReceber> listamodelContasReceber = new ArrayList();
        ModelContasReceber modelContasReceber = new ModelContasReceber();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_contas_receber,"
                    + "fk_cliente,"
                    + "fk_forma_pagamento,"
                    + "fk_venda,"
                    + "descricao_contas_receber,"
                    + "data_contas_receber,"
                    + "vencimento_contas_receber,"
                    + "pagamento_contas_receber,"
                    + "valor_contas_receber,"
                    + "situacao_contas_receber,"
                    + "obs_contas_receber,"
                    + "rec_parcelas"
                    + " FROM tb_contas_receber"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelContasReceber = new ModelContasReceber();
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
                modelContasReceber.setNumeroParcelas(this.getResultSet().getInt(12));
                listamodelContasReceber.add(modelContasReceber);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listamodelContasReceber;
    }

    /**
     * recupera uma lista de ContasReceber return ArrayList
     */
    public ArrayList<ModelContasReceber> getListaContasReceberDAO(int pIdContasReceber) {
        ArrayList<ModelContasReceber> listamodelContasReceber = new ArrayList();
        ModelContasReceber modelContasReceber = new ModelContasReceber();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_contas_receber,"
                    + "fk_cliente,"
                    + "fk_forma_pagamento,"
                    + "fk_venda,"
                    + "descricao_contas_receber,"
                    + "data_contas_receber,"
                    + "vencimento_contas_receber,"
                    + "pagamento_contas_receber,"
                    + "valor_contas_receber,"
                    + "situacao_contas_receber,"
                    + "obs_contas_receber,"
                    + "rec_parcelas"         
                    + " FROM tb_contas_receber"
                    + "WHERE pk_id_contas_receber = '" + pIdContasReceber + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelContasReceber = new ModelContasReceber();
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
                modelContasReceber.setNumeroParcelas(this.getResultSet().getInt(12));
                listamodelContasReceber.add(modelContasReceber);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listamodelContasReceber;
    }

    /**
     * recupera uma lista de ContasReceber return ArrayList
     */
    public ArrayList<ModelContasReceber> getListaContasRecebidasDAO(int pIdContasRecebidas) {
        ArrayList<ModelContasReceber> listamodelContasReceber = new ArrayList();
        ModelContasReceber modelContasReceber = new ModelContasReceber();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_contas_receber,"
                    + "fk_cliente,"
                    + "fk_forma_pagamento,"
                    + "fk_venda,"
                    + "descricao_contas_receber,"
                    + "data_contas_receber,"
                    + "vencimento_contas_receber,"
                    + "pagamento_contas_receber,"
                    + "valor_contas_receber,"
                    + "situacao_contas_receber,"
                    + "obs_contas_receber,"
                    + "rec_parcelas" 
                    + " FROM tb_contas_receber"
                    + " WHERE pk_id_contas_receber = '" + pIdContasRecebidas + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelContasReceber = new ModelContasReceber();
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
                modelContasReceber.setNumeroParcelas(this.getResultSet().getInt(12));
                listamodelContasReceber.add(modelContasReceber);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listamodelContasReceber;
    }

    /**
     * atualiza ContasReceber
     *
     * @param pModelContasReceber return boolean
     */
    public boolean atualizarContasReceberDAO(ModelContasReceber pModelContasReceber) {
        try {
            this.conectar();

            Date pagamento = pModelContasReceber.getPagamentoContasReceber();
            String strPagamento = "NULL";
            if (pagamento != null) {
                strPagamento = "'" + pagamento + "'";
            }

            return this.executarUpdateDeleteSQL(
                    "UPDATE tb_contas_receber SET "
                    + "pk_id_contas_receber = '" + pModelContasReceber.getIdContasReceber() + "',"
                    + "fk_cliente = '" + pModelContasReceber.getFkCliente() + "',"
                    + "fk_forma_pagamento = '" + pModelContasReceber.getFkPagamento() + "',"
                    + "fk_venda = '" + pModelContasReceber.getFkVenda() + "',"
                    + "descricao_contas_receber = '" + pModelContasReceber.getDescricaoContasReceber() + "',"
                    + "data_contas_receber = '" + pModelContasReceber.getDataContasReceber() + "',"
                    + "vencimento_contas_receber = '" + pModelContasReceber.getVencimentoContasReceber() + "',"
                    + "pagamento_contas_receber = " + strPagamento + ","
                    + "valor_contas_receber = '" + pModelContasReceber.getValorContasReceber() + "',"
                    + "situacao_contas_receber = '" + pModelContasReceber.getSituaçãoContasReceber() + "',"
                    + "obs_contas_receber = '" + pModelContasReceber.getObservacaoContasReceber() + "',"
                    + "rec_parcelas = '" + pModelContasReceber.getNumeroParcelas() + "'"
                    + " WHERE "
                    + "pk_id_contas_receber = '" + pModelContasReceber.getIdContasReceber() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * atualiza para ContasRecebidas
     *
     * @param pModelContasReceber return boolean
     */
    public boolean atualizarContasRecebidasDAO(ModelContasReceber pModelContasReceber) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tb_contas_receber SET "
                    + "pagamento_contas_receber = null,"
                    + "situacao_contas_receber = '" + pModelContasReceber.getSituaçãoContasReceber() + "'"
                    + " WHERE "
                    + "pk_id_contas_receber = '" + pModelContasReceber.getIdContasReceber() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * atualiza para ContasReceber
     *
     * @param pModelContasReceber return boolean
     */
    public boolean atualizarContasReceberDAO2(ModelContasReceber pModelContasReceber) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tb_contas_receber SET "
                    + "pagamento_contas_receber = '" + pModelContasReceber.getPagamentoContasReceber() + "',"
                    + "valor_contas_receber = '" + pModelContasReceber.getValorContasReceber() + "',"
                    + "situacao_contas_receber = '" + pModelContasReceber.getSituaçãoContasReceber() + "'"
                    + " WHERE "
                    + "pk_id_contas_receber = '" + pModelContasReceber.getIdContasReceber() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * exclui ContasReceber
     *
     * @param pIdContasReceber return boolean
     */
    public boolean excluirContasReceberDAO(int pIdContasReceber) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tb_contas_receber "
                    + " WHERE "
                    + "pk_id_contas_receber = '" + pIdContasReceber + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * exclui ContasReceber
     *
     * @param pIdVendaContasReceber return boolean
     */
    public boolean excluirContasReceberDAOVenda(int pIdVendaContasReceber) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tb_contas_receber "
                    + " WHERE "
                    + "fk_venda = '" + pIdVendaContasReceber + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
