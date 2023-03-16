/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bebidas;

/**
 *
 * @author eduro
 */
public class Cerveja {
    
    private String marca;
    private float teorAlcoolico;
    private int volume;
    private int codigo;
    private static int proximoCodigo = 1;
    
    public Cerveja(String marca) {
        this.marca = marca;
        this.codigo = proximoCodigo;
        proximoCodigo++;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setTeorAlcoolico(float teorAlcoolico) {
        this.teorAlcoolico = teorAlcoolico;
    }
    
    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public float getTeorAlcoolico() {
        return teorAlcoolico;
    }
    
    public int getVolume() {
        return volume;
    }
    
    public int getCodigo() {
        return codigo;
    }
}

