package com.mycompany.aula02;
public class Aula02 {
    public static void main(String[] args) {
       Caneta c1 = new Caneta ();
       c1.Cor = "Azul";
       c1.ponta = 0.5f;
       c1.tampar();
       c1.status();
       c1.rabiscar();
       
       Caneta c2 = new Caneta ();
       c2.modelo = "Hostnet";
       c2.Cor = "Preta";
       c2.destampar();
       c2.status();
       c2.rabiscar();
    }
}
