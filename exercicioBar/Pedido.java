/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mesadebar;

/**
 *
 * @author eduro
 */
public class Pedido {
    private String nomeCliente;
    private String itemPedido;
    private int quantidade;
    private double valorUnitario;
    private double valorTotal;
    
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    public void setItemPedido(String itemPedido) {
        this.itemPedido = itemPedido;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
    public void calcularValorTotal() {
        this.valorTotal = this.quantidade * this.valorUnitario;
    }
    
    public double getValorTotal() {
        return this.valorTotal;
    }
}
