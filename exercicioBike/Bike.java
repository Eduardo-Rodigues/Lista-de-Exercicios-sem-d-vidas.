/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bike;

/**
 *
 * @author eduro
 */
public class Bike {

    public static void main(String[] args) {
        Bicicleta bike1 = new Bicicleta("Caloi", 26);
        bike1.cor = "Azul";
        bike1.setNumMarchas(21);
        bike1.setTipoFreio("Disco");
        bike1.setValor(2000.99);
        bike1.setEletrica(false);
        
        Bicicleta bike2 = new Bicicleta("Oxford", 29);
        bike2.cor = "Roxa";
        bike2.setNumMarchas(24);
        bike2.setTipoFreio("V-Brake");
        bike2.setValor(2500.45);
        bike2.setEletrica(true);
        
        Bicicleta bike3 = new Bicicleta("Caloi", 24);
        bike3.cor = "Roxa";
        bike3.setNumMarchas(18);
        bike3.setTipoFreio("V-Brake");
        bike3.setValor(1200.0);
        bike3.setEletrica(false);
        
        Bicicleta bike4 = new Bicicleta("Specialized", 27);
        bike4.cor = "Preta";
        bike4.setNumMarchas(30);
        bike4.setTipoFreio("Disco");
        bike4.setValor(3500.0);
        bike4.setEletrica(false);
        
        System.out.println("Bike 1: " + bike1.modelo + ", aro " + bike1.aro + ", cor " + bike1.cor + ", " +
                           bike1.numMarchas + " marchas, freio " + bike1.tipoFreio + ", valor R$ " + bike1.valor + 
                           ", elétrica? " + bike1.Eletrica);
        System.out.println("Bike 2: " + bike2.modelo + ", aro " + bike2.aro + ", cor " + bike2.cor + ", " +
                           bike2.numMarchas + " marchas, freio " + bike2.tipoFreio + ", valor R$ " + bike2.valor + 
                           ", elétrica? " + bike2.Eletrica);
    }
}
