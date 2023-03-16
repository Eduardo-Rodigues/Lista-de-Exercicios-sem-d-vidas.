/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bike;

/**
 *
 * @author eduro
 */
public class Bicicleta {public String modelo;
    public int aro;
    public String cor;
    int numMarchas;
    String tipoFreio;
    double valor;
    boolean Eletrica;
    
    public Bicicleta(String modelo, int aro) {
        this.modelo = modelo;
        this.aro = aro;
    }
    
    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }
    
    public void setTipoFreio(String tipoFreio) {
        this.tipoFreio = tipoFreio;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void setIsEletrica(boolean isEletrica) {
        this.Eletrica = isEletrica;
    }  

    

    void setEletrica(boolean b) {
        }

    
}
