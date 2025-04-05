package com.mycompany.aula02;
public class Caneta {
    String modelo;
    String Cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.print("Uma caneta " + this.Cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }
    void rabiscar () {
        if (this.tampada == true) {
            System.out.println("ERRO! Nao Posso Rabiscar!");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }
    void tampar (){
        this.tampada = true;
    }
    
    void destampar (){
        this.tampada = false;
    }
}
