/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adv;

import java.util.Scanner;

/**
 *
 * @author eduro
 */
public class Adv {

    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Advogado[] advogados = new Advogado[8];

        for (int i = 0; i < 8; i++) {
            System.out.println("Advogado " + (i + 1));

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Idade: ");
            int idade = Integer.parseInt(scanner.nextLine());

            Advogado advogado = new Advogado(nome, idade);

            System.out.print("CPF: ");
            advogado.setCpf(scanner.nextLine());

            System.out.print("OAB: ");
            advogado.setOab(scanner.nextLine());

            System.out.print("Especialidade: ");
            advogado.setEspecialidade(scanner.nextLine());

            System.out.print("Endereço: ");
            advogado.setEndereco(scanner.nextLine());

            System.out.print("Telefone: ");
            advogado.setTelefone(scanner.nextLine());

            advogados[i] = advogado;
        }

        System.out.println("\nÚltimos 3 Advogados Cadastrados:");

        for (int i = 5; i < 8; i++) {
            Advogado advogado = advogados[i];
            System.out.println("Nome: " + advogado.nome + " | Idade: " + advogado.idade + " | CPF: " + advogado.getCpf() + " | OAB: " + advogado.getOab() + " | Especialidade: " + advogado.getEspecialidade() + " | Endereço: " + advogado.getEndereco() + " | Telefone: " + advogado.getTelefone());
        }
    }
}
}
