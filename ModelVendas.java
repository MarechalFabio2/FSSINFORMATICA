package model;

import java.sql.Date;

/**
 *
 * @author Fabio
 */
public class ModelVendas {

    /**
     * @return the formaPagamento
     */
    public int getFormaPagamento() {
        return formaPagamento;
    }

    /**
     * @param formaPagamento the formaPagamento to set
     */
    public void setFormaPagamento(int pFormaPagamento) {
        this.formaPagamento = pFormaPagamento;
    }

    private int idVenda;
    private int cliente;
    private int formaPagamento;
    private Date venDataVenda;
    private double venValorLiquido;
    private double venValorBruto;
    private double venValorDesconto;

    /**
     * Construtor
     */
    public ModelVendas() {
    }

    /**
     * seta o valor de idVenda
     *
     * @param pIdVenda
     */
    public void setIdVenda(int pIdVenda) {
        this.idVenda = pIdVenda;
    }

    /**
     * return pk_idVenda
     */
    public int getIdVenda() {
        return this.idVenda;
    }

    /**
     * seta o valor de cliente
     *
     * @param pCliente
     */
    public void setCliente(int pCliente) {
        this.cliente = pCliente;
    }

    /**
     * return fk_cliente
     */
    public int getCliente() {
        return this.cliente;
    }

    /**
     * seta o valor de venDataVenda
     *
     * @param pVenDataVenda
     */
    public void setVenDataVenda(Date pVenDataVenda) {
        this.venDataVenda = pVenDataVenda;
    }

    /**
     * return venDataVenda
     */
    public Date getVenDataVenda() {
        return this.venDataVenda;
    }

    /**
     * seta o valor de venValorLiquido
     *
     * @param pVenValorLiquido
     */
    public void setVenValorLiquido(double pVenValorLiquido) {
        this.venValorLiquido = pVenValorLiquido;
    }

    /**
     * return venValorLiquido
     */
    public double getVenValorLiquido() {
        return this.venValorLiquido;
    }

    /**
     * seta o valor de venValorBruto
     *
     * @param pVenValorBruto
     */
    public void setVenValorBruto(double pVenValorBruto) {
        this.venValorBruto = pVenValorBruto;
    }

    /**
     * return venValorBruto
     */
    public double getVenValorBruto() {
        return this.venValorBruto;
    }

    /**
     * seta o valor de venValorDesconto
     *
     * @param pVenValorDesconto
     */
    public void setVenValorDesconto(double pVenValorDesconto) {
        this.venValorDesconto = pVenValorDesconto;
    }

    /**
     * return venValorDesconto
     */
    public double getVenValorDesconto() {
        return this.venValorDesconto;
    }

    @Override
    public String toString() {
        return "ModelVendas {" + "::idVenda = " + this.idVenda + "::cliente = " + this.cliente + "::formaPagamento = " + this.formaPagamento + "::venDataVenda = " + this.venDataVenda + "::venValorLiquido = " + this.venValorLiquido + "::venValorBruto = " + this.venValorBruto + "::venValorDesconto = " + this.venValorDesconto + "}";
    }

    public void getVenValorBruto(double parseDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getVenDataVenda(String parseBra) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
