package DAO;

import model.ModelFormaPagamento;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Fabio
*/
public class DAOFormaPagamento extends ConexaoMySql {

    /**
    * grava FormaPagamento
    * @param pModelFormaPagamento
    * return int
    */
    public int salvarFormaPagamentoDAO(ModelFormaPagamento pModelFormaPagamento){
        try {
            this.conectar();
            return this.insertSQL(
                    "TB_FORMA_PAGAMENTO",
                "INSERT INTO tb_forma_pagamento ("
                  + "descricao_forma_pagamento,"
                    + "desconto_forma_pagamento,"
                    + "parcela_forma_pagamento,"
                    + "situacao_forma_pagamento"
                + ") VALUES ("
                    + "'" + pModelFormaPagamento.getDescricaoFormaPagamento() + "',"
                    + "'" + pModelFormaPagamento.getDescontoFormaPagamento() + "',"
                    + "'" + pModelFormaPagamento.getParcelaFormaPagamento() + "',"
                    + "'" + pModelFormaPagamento.getSituacaoFormaPagamento() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }
    }

    /**
    * recupera FormaPagamento
    * @param pIdFormaPagamento
    * return ModelFormaPagamento
    */
    public ModelFormaPagamento getFormaPagamentoDAO(int pIdFormaPagamento){
        ModelFormaPagamento modelFormaPagamento = new ModelFormaPagamento();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_forma_pagamento,"
                    + "descricao_forma_pagamento,"
                    + "desconto_forma_pagamento,"
                    + "parcela_forma_pagamento,"
                    + "situacao_forma_pagamento"
                 + " FROM"
                     + " tb_forma_pagamento"
                 + " WHERE"
                     + " pk_id_forma_pagamento = '" + pIdFormaPagamento + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFormaPagamento.setIdFormaPagamento(this.getResultSet().getInt(1));
                modelFormaPagamento.setDescricaoFormaPagamento(this.getResultSet().getString(2));
                modelFormaPagamento.setDescontoFormaPagamento(this.getResultSet().getFloat(3));
                modelFormaPagamento.setParcelaFormaPagamento(this.getResultSet().getInt(4));
                modelFormaPagamento.setSituacaoFormaPagamento(this.getResultSet().getInt(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return modelFormaPagamento;
    }
    /**
    * recupera FormaPagamento
    * @param pDescricaoFormaPagamento
    * return ModelFormaPagamento
    */
    public ModelFormaPagamento getFormaPagamentoDAO(String pDescricaoFormaPagamento){
        ModelFormaPagamento modelFormaPagamento = new ModelFormaPagamento();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                + "pk_id_forma_pagamento, "
                + "descricao_forma_pagamento, "
                + "desconto_forma_pagamento, "
                + "parcela_forma_pagamento, "
                + "situacao_forma_pagamento "
                + " FROM"
                + " tb_forma_pagamento"
                + " WHERE"
                + " descricao_forma_pagamento = '" + pDescricaoFormaPagamento + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFormaPagamento.setIdFormaPagamento(this.getResultSet().getInt(1));
                modelFormaPagamento.setDescricaoFormaPagamento(this.getResultSet().getString(2));
                modelFormaPagamento.setDescontoFormaPagamento(this.getResultSet().getFloat(3));
                modelFormaPagamento.setParcelaFormaPagamento(this.getResultSet().getInt(4));
                modelFormaPagamento.setSituacaoFormaPagamento(this.getResultSet().getInt(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return modelFormaPagamento;
    }

    /**
    * recupera uma lista de FormaPagamento
        * return ArrayList
    */
    public ArrayList<ModelFormaPagamento> getListaFormaPagamentoDAO(){
        ArrayList<ModelFormaPagamento> listamodelFormaPagamento = new ArrayList();
        ModelFormaPagamento modelFormaPagamento = new ModelFormaPagamento();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_forma_pagamento,"
                    + "descricao_forma_pagamento,"
                    + "desconto_forma_pagamento,"
                    + "parcela_forma_pagamento,"
                    + "situacao_forma_pagamento"
                 + " FROM"
                     + " tb_forma_pagamento"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFormaPagamento = new ModelFormaPagamento();
                modelFormaPagamento.setIdFormaPagamento(this.getResultSet().getInt(1));
                modelFormaPagamento.setDescricaoFormaPagamento(this.getResultSet().getString(2));
                modelFormaPagamento.setDescontoFormaPagamento(this.getResultSet().getFloat(3));
                modelFormaPagamento.setParcelaFormaPagamento(this.getResultSet().getInt(4));
                modelFormaPagamento.setSituacaoFormaPagamento(this.getResultSet().getInt(5));
                listamodelFormaPagamento.add(modelFormaPagamento);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return listamodelFormaPagamento;
    }

    /**
    * atualiza FormaPagamento
    * @param pModelFormaPagamento
    * return boolean
    */
    public boolean atualizarFormaPagamentoDAO(ModelFormaPagamento pModelFormaPagamento){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tb_forma_pagamento SET "
                    + "pk_id_forma_pagamento = '" + pModelFormaPagamento.getIdFormaPagamento() + "',"
                    + "descricao_forma_pagamento = '" + pModelFormaPagamento.getDescricaoFormaPagamento() + "',"
                    + "desconto_forma_pagamento = '" + pModelFormaPagamento.getDescontoFormaPagamento() + "',"
                    + "parcela_forma_pagamento = '" + pModelFormaPagamento.getParcelaFormaPagamento() + "',"
                    + "situacao_forma_pagamento = '" + pModelFormaPagamento.getSituacaoFormaPagamento() + "'"
                + " WHERE "
                    + "pk_id_forma_pagamento = '" + pModelFormaPagamento.getIdFormaPagamento() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

    /**
    * exclui FormaPagamento
    * @param pIdFormaPagamento
    * return boolean
    */
    public boolean excluirFormaPagamentoDAO(int pIdFormaPagamento){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tb_forma_pagamento "
                + " WHERE "
                    + "pk_id_forma_pagamento = '" + pIdFormaPagamento + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
}