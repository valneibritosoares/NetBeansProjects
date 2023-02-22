package com.mycompany.ex11;
public class Peixe extends Animal {
   private String corEscama; 
    
   public void soltarBolha(){
       System.out.println("Soltando bolhas.");
   }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Comer substancia");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som.");
    }
   
   
}
