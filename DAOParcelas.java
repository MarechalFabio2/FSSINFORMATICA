package DAO;

import model.ModelParcelas;
import conexoes.ConexaoMySql;
import java.sql.SQLException;
import java.util.ArrayList;
import util.BLMascaras;
/**
*
* @author Fabio
*/
public class DAOParcelas extends ConexaoMySql {
    
    BLMascaras bLMascaras = new BLMascaras();

    /**
    * grava Parcelas
    * @param pModelParcelas
    * @return int
    */
    public int salvarParcelasDAO(ModelParcelas pModelParcelas){
        try {
            this.conectar();
            return this.insertSQL(
                "TB_PARCELAS",
                "INSERT INTO tb_parcelas ("
                    + "fk_conta,"
                    + "ven_valor_parcela,"
                    + "num_parcela,"
                    + "dat_parcela"
                + ") VALUES ("
                    + "'" + pModelParcelas.getConta() + "',"
                    + "'" + pModelParcelas.getValorParcela() + "',"
                    + "'" + pModelParcelas.getNumeroParcela() + "',"        
                    + "'" + pModelParcelas.getDataParcela() + "'"
                + ");"
            );
        }catch(Exception e){
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Parcelas
    * @param pIDParcela
    * @return ModelParcelas
    */
    public ModelParcelas getParcelasDAO(int pIDParcela){
        ModelParcelas modelParcelas = new ModelParcelas();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_parcela,"
                    + "fk_conta,"
                    + "ven_valor_parcela,"
                    + "num_parcela,"
                    + "dat_parcela"
                 + " FROM"
                     + " tb_parcelas"
                 + " WHERE"
                     + " pk_idparcela = '" + pIDParcela + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelParcelas.setIDParcela(this.getResultSet().getInt(1));
                modelParcelas.setConta(this.getResultSet().getInt(2));
                modelParcelas.setValorParcela(this.getResultSet().getDouble(3));
                modelParcelas.setNumeroParcela(this.getResultSet().getInt(4));
                modelParcelas.setDataParcela(this.getResultSet().getDate(5));
            }
        }catch(SQLException e){
        }finally{
            this.fecharConexao();
        }
        return modelParcelas;
    }

    /**
    * recupera uma lista de Parcelas
        * @return ArrayList
    */
    public ArrayList<ModelParcelas> getListaParcelasDAO(){
        ArrayList<ModelParcelas> listamodelParcelas = new ArrayList();
        ModelParcelas modelParcelas = new ModelParcelas();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_parcela,"
                    + "fk_conta,"
                    + "ven_valor_parcela,"
                    + "num_parcela,"
                    + "dat_parcela"
                 + " FROM"
                     + " tb_parcelas"
                + ";"
            );

            while(this.getResultSet().next()){
                modelParcelas = new ModelParcelas();
                modelParcelas.setIDParcela(this.getResultSet().getInt(1));
                modelParcelas.setConta(this.getResultSet().getInt(2));
                modelParcelas.setValorParcela(this.getResultSet().getDouble(3));
                modelParcelas.setNumeroParcela(this.getResultSet().getInt(4));
                modelParcelas.setDataParcela(this.getResultSet().getDate(5));
                listamodelParcelas.add(modelParcelas);
            }
        }catch(SQLException e){
        }finally{
            this.fecharConexao();
        }
        return listamodelParcelas;
    }

    /**
    * atualiza Parcelas
    * @param pModelParcelas
    * @return boolean
    */
    public boolean atualizarParcelasDAO(ModelParcelas pModelParcelas){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tb_parcelas SET "
                    + "pk_id_parcela = '" + pModelParcelas.getIDParcela() + "',"
                    + "fk_conta = '" + pModelParcelas.getConta() + "',"
                    + "ven_valor_parcela = '" + pModelParcelas.getValorParcela() + "',"
                    + "num_parcela = '" + pModelParcelas.getNumeroParcela() + "',"
                    + "dat_parcela = '" + pModelParcelas.getDataParcela() + "'"
                + " WHERE "
                    + "pk_idparcela = '" + pModelParcelas.getIDParcela() + "'"
                + ";"
            );
        }catch(Exception e){
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Parcelas
    * @param pIDParcela
    * @return boolean
    */
    public boolean excluirParcelasDAO(int pIDParcela){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tb_parcelas "
                + " WHERE "
                    + "pk_id_parcela = '" + pIDParcela + "'"
                + ";"
            );
        }catch(Exception e){
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    public boolean salvarParcelasDAO(ArrayList<ModelParcelas> pListaModelParcelas) {
        try {
            this.conectar();
            int cont = pListaModelParcelas.size();
            for (int i = 0; i < cont; i++) {
                this.insertSQL(
                        "TB_PARCELAS",
                        "INSERT INTO tb_parcelas ("
                        + "fk_conta,"
                        + "ven_valor_parcela,"
                        + "num_parcela,"
                        + "dat_parcela"
                        + ") VALUES ("
                        + "'" + pListaModelParcelas.get(i).getConta() + "',"
                        + "'" + pListaModelParcelas.get(i).getValorParcela() + "',"
                        + "'" + pListaModelParcelas.get(i).getNumeroParcela() + "',"
                        + "'" + pListaModelParcelas.get(i).getDataParcela() + "'"
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