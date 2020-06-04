package model;

import java.sql.Date;

/**
*
* @author Fabio
*/
public class ModelParcelas {

    /**
     * @return the NumeroParcela
     */
    public int getNumeroParcela() {
        return NumeroParcela;
    }

    /**
     * @param NumeroParcela the NumeroParcela to set
     */
    public void setNumeroParcela(int NumeroParcela) {
        this.NumeroParcela = NumeroParcela;
    }

    /**
     * @return the DataParcela
     */
    public Date getDataParcela() {
        return DataParcela;
    }

    /**
     * @param DataParcela the DataParcela to set
     */
    public void setDataParcela(Date DataParcela) {
        this.DataParcela = DataParcela;
    }

    private int IDParcela;
    private int Conta;
    private double ValorParcela;
    private int NumeroParcela;
    private Date DataParcela;

    /**
    * Construtor
    */
    public ModelParcelas(){}

    /**
    * seta o valor de IDParcela
    * @param pIDParcela
    */
    public void setIDParcela(int pIDParcela){
        this.IDParcela = pIDParcela;
    }
    /**
    * @return pk_IDParcela
    */
    public int getIDParcela(){
        return this.IDParcela;
    }

    /**
    * seta o valor de Conta
    * @param pConta
    */
    public void setConta(int pConta){
        this.Conta = pConta;
    }
    /**
    * @return fk_Conta
    */
    public int getConta(){
        return this.Conta;
    }

    /**
    * seta o valor de ValorParcela
    * @param pValorParcela
    */
    public void setValorParcela(double pValorParcela){
        this.ValorParcela = pValorParcela;
    }
    /**
    * @return ValorParcela
    */
    public double getValorParcela(){
        return this.ValorParcela;
    }

    @Override
    public String toString(){
        return "ModelParcelas {" + "::IDParcela = " + this.IDParcela + "::Conta = " + this.Conta + "::ValorParcela = " + this.ValorParcela +  "}";
    }
}