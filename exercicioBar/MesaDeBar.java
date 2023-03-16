/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mesadebar;

import java.util.Scanner;

/**
 *
 * @author eduro
 */
public class MesaDeBar {

       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pedido[] pedidos = new Pedido[5];
        double totalPedidos = 0;
        
        for (int i = 0; i < pedidos.length; i++) {
            System.out.println("Pedido #" + (i+1));
            Pedido pedido = new Pedido();
            System.out.print("Nome do cliente: ");
            pedido.setNomeCliente(sc.nextLine());
            System.out.print("Item do pedido: ");
            pedido.setItemPedido(sc.nextLine());
            System.out.print("Quantidade: ");
            pedido.setQuantidade(sc.nextInt());
            System.out.print("Valor unitário: R$ ");
            pedido.setValorUnitario(sc.nextDouble());
            sc.nextLine();
            pedido.calcularValorTotal();
            totalPedidos += pedido.getValorTotal();
            pedidos[i] = pedido;
            System.out.println();
        }
        
        System.out.println("Total dos 5 pedidos: R$ " + totalPedidos);
    }
}
