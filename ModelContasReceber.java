package model;

import java.sql.Date;

/**
*
* @author Fabio
*/
public class ModelContasReceber {

    private int idContasReceber;
    private int fkCliente;
    private int fkPagamento;
    private int fkVenda;
    private String DescricaoContasReceber;
    private Date DataContasReceber;
    private Date VencimentoContasReceber;
    private Date PagamentoContasReceber;
    private Double ValorContasReceber;
    private int SituaçãoContasReceber;
    private String ObservacaoContasReceber;
    private int NumeroParcelas;

    /**
     * @return the idContasReceber
     */
    public int getIdContasReceber() {
        return idContasReceber;
    }

    /**
     * @param idContasReceber the idContasReceber to set
     */
    public void setIdContasReceber(int idContasReceber) {
        this.idContasReceber = idContasReceber;
    }

    /**
     * @return the fkCliente
     */
    public int getFkCliente() {
        return fkCliente;
    }

    /**
     * @param fkCliente the fkCliente to set
     */
    public void setFkCliente(int fkCliente) {
        this.fkCliente = fkCliente;
    }

    /**
     * @return the fkPagamento
     */
    public int getFkPagamento() {
        return fkPagamento;
    }

    /**
     * @param fkPagamento the fkPagamento to set
     */
    public void setFkPagamento(int fkPagamento) {
        this.fkPagamento = fkPagamento;
    }

    /**
     * @return the fkVenda
     */
    public int getFkVenda() {
        return fkVenda;
    }

    /**
     * @param fkVenda the fkVenda to set
     */
    public void setFkVenda(int fkVenda) {
        this.fkVenda = fkVenda;
    }

    /**
     * @return the DescricaoContasReceber
     */
    public String getDescricaoContasReceber() {
        return DescricaoContasReceber;
    }

    /**
     * @param DescricaoContasReceber the DescricaoContasReceber to set
     */
    public void setDescricaoContasReceber(String DescricaoContasReceber) {
        this.DescricaoContasReceber = DescricaoContasReceber;
    }

    /**
     * @return the DataContasReceber
     */
    public Date getDataContasReceber() {
        return DataContasReceber;
    }

    /**
     * @param DataContasReceber the DataContasReceber to set
     */
    public void setDataContasReceber(Date DataContasReceber) {
        this.DataContasReceber = DataContasReceber;
    }

    /**
     * @return the VencimentoContasReceber
     */
    public Date getVencimentoContasReceber() {
        return VencimentoContasReceber;
    }

    /**
     * @param VencimentoContasReceber the VencimentoContasReceber to set
     */
    public void setVencimentoContasReceber(Date VencimentoContasReceber) {
        this.VencimentoContasReceber = VencimentoContasReceber;
    }

    /**
     * @return the PagamentoContasReceber
     */
    public Date getPagamentoContasReceber() {
        return PagamentoContasReceber;
    }

    /**
     * @param PagamentoContasReceber the PagamentoContasReceber to set
     */
    public void setPagamentoContasReceber(Date PagamentoContasReceber) {
        this.PagamentoContasReceber = PagamentoContasReceber;
    }

    /**
     * @return the ValorContasReceber
     */
    public Double getValorContasReceber() {
        return ValorContasReceber;
    }

    /**
     * @param ValorContasReceber the ValorContasReceber to set
     */
    public void setValorContasReceber(Double ValorContasReceber) {
        this.ValorContasReceber = ValorContasReceber;
    }

    /**
     * @return the SituaçãoContasReceber
     */
    public int getSituaçãoContasReceber() {
        return SituaçãoContasReceber;
    }

    /**
     * @param SituaçãoContasReceber the SituaçãoContasReceber to set
     */
    public void setSituaçãoContasReceber(int SituaçãoContasReceber) {
        this.SituaçãoContasReceber = SituaçãoContasReceber;
    }

    /**
     * @return the ObservacaoContasReceber
     */
    public String getObservacaoContasReceber() {
        return ObservacaoContasReceber;
    }

    /**
     * @param ObservacaoContasReceber the ObservacaoContasReceber to set
     */
    public void setObservacaoContasReceber(String ObservacaoContasReceber) {
        this.ObservacaoContasReceber = ObservacaoContasReceber;
    }

    /**
     * @return the NumeroParcelas
     */
    public int getNumeroParcelas() {
        return NumeroParcelas;
    }

    /**
     * @param NumeroParcelas the NumeroParcelas to set
     */
    public void setNumeroParcelas(int NumeroParcelas) {
        this.NumeroParcelas = NumeroParcelas;
    }

    
}