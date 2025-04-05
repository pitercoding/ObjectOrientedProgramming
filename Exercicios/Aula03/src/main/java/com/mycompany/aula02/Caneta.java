package com.mycompany.aula02;
public class Caneta {
    public String modelo;
    public String Cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.print("Uma caneta " + this.Cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }
    public void rabiscar () {
        if (this.tampada == true) {
            System.out.println("ERRO! Nao Posso Rabiscar!");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }
    public void tampar (){
        this.tampada = true;
    }
    
    public void destampar (){
        this.tampada = false;
    }
}
