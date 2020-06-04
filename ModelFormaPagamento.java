package model;
/**
*
* @author Fabio
*/
public class ModelFormaPagamento {

    private int idFormaPagamento;
    private String DescricaoFormaPagamento;
    private float descontoFormaPagamento;
    private int parcelaFormaPagamento;
    private int situacaoFormaPagamento;

    /**
    * Construtor
    */
    public ModelFormaPagamento(){}

    /**
    * seta o valor de idFormaPagamento
    * @param pIdFormaPagamento
    */
    public void setIdFormaPagamento(int pIdFormaPagamento){
        idFormaPagamento = pIdFormaPagamento;
    }
    /**
    * return pk_idFormaPagamento
    */
    public int getIdFormaPagamento(){
        return idFormaPagamento;
    }

    /**
    * seta o valor de DescricaoFormaPagamento
    * @param pDescricaoFormaPagamento
    */
    public void setDescricaoFormaPagamento(String pDescricaoFormaPagamento){
        this.DescricaoFormaPagamento = pDescricaoFormaPagamento;
    }
    /**
    * return DescricaoFormaPagamento
    */
    public String getDescricaoFormaPagamento(){
        return this.DescricaoFormaPagamento;
    }

    /**
    * seta o valor de descontoFormaPagamento
    * @param pDescontoFormaPagamento
    */
    public void setDescontoFormaPagamento(float pDescontoFormaPagamento){
        this.descontoFormaPagamento = pDescontoFormaPagamento;
    }
    /**
    * return descontoFormaPagamento
    */
    public float getDescontoFormaPagamento(){
        return this.descontoFormaPagamento;
    }

    /**
    * seta o valor de parcelaFormaPagamento
    * @param pParcelaFormaPagamento
    */
    public void setParcelaFormaPagamento(int pParcelaFormaPagamento){
        this.parcelaFormaPagamento = pParcelaFormaPagamento;
    }
    /**
    * return parcelaFormaPagamento
    */
    public int getParcelaFormaPagamento(){
        return this.parcelaFormaPagamento;
    }

    /**
    * seta o valor de situacaoFormaPagamento
    * @param pSituacaoFormaPagamento
    */
    public void setSituacaoFormaPagamento(int pSituacaoFormaPagamento){
        this.situacaoFormaPagamento = pSituacaoFormaPagamento;
    }
    /**
    * return situacaoFormaPagamento
    */
    public int getSituacaoFormaPagamento(){
        return this.situacaoFormaPagamento;
    }

    @Override
    public String toString(){
        return "ModelFormaPagamento {" + "::idFormaPagamento = " + this.idFormaPagamento + "::DescricaoFormaPagamento = " + this.DescricaoFormaPagamento + "::descontoFormaPagamento = " + this.descontoFormaPagamento + "::parcelaFormaPagamento = " + this.parcelaFormaPagamento + "::situacaoFormaPagamento = " + this.situacaoFormaPagamento +  "}";
    }
}