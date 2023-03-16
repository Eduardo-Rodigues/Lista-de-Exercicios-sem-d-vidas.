/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bebidas;

import java.util.Scanner;

/**
 *
 * @author eduro
 */
public class Bebidas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Cerveja[] cervejas = new Cerveja[5];
        
        for(int i=0; i<5; i++) {
            System.out.print("Digite a marca da cerveja: ");
            String marca = input.nextLine();
            cervejas[i] = new Cerveja(marca);
            
            System.out.print("Digite o teor alcoólico da cerveja: ");
            float teor = input.nextFloat();
            input.nextLine();
            cervejas[i].setTeorAlcoolico(teor);
            
            System.out.print("Digite o volume da cerveja (em mL): ");
            int volume = input.nextInt();
            input.nextLine();
            cervejas[i].setVolume(volume);
        }
        
        System.out.println("Cervejas cadastradas:");
        for(Cerveja cerveja : cervejas) {
            System.out.println("Marca: " + cerveja.getMarca());
            System.out.println("Teor alcoólico: " + cerveja.getTeorAlcoolico());
            System.out.println("Volume: " + cerveja.getVolume());
            System.out.println("Código: " + cerveja.getCodigo());
            System.out.println();
        }
    }
}
