package com.mycompany.ex11;
public class Cachorro  extends Mamifero  {
    public void enterraOsso(){
        System.out.println("Enterrando o Osso");
    }
    public void abanaRabo(){
        System.out.println("Abanando Rabo");
    }
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!...");
    }
    public void reagir(String frase){
        switch (frase) {
            case "bom" -> System.out.println("abanar e latir");
            case "mau" -> System.out.println("rosnar");
            default -> System.out.println("ignorar");
        }
    }
    public void reagir(int hora, int munuto){
        switch (hora) {
            case 5,6,7,8,9,10,11,12 -> System.out.println("abanar");
            case 13,14,15,16,17,18,19 -> System.out.println("abanar e latir");
            default -> System.out.println("ignorar");
        }
    }
    public void reagir(boolean dono){
        if (dono) {
            System.out.println("abanar");
        } else {
            System.out.println("rosnar e latir"); 
        }
    }
    public void reagir(int idade, float peso){
        if (idade < 5 && peso < 10) {
            System.out.println("abanar");
        } else if(idade < 5){
            System.out.println("latir");
        } else if(idade >= 5 && peso < 10){
            System.out.println("rosnar");
        }else {
            System.out.println("ignorar");    
        }
    }
}
