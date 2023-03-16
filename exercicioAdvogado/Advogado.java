/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adv;

/**
 *
 * @author eduro
 */
public class Advogado {
    public String nome;
    public int idade;
    private String cpf;
    private String oab;
    private String especialidade;
    private String endereco;
    private String telefone;

    public Advogado(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getOab() {
        return oab;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }
}


