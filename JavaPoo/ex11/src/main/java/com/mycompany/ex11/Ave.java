package com.mycompany.ex11;
public class Ave extends Animal {
    private String corPena;
    
    public void fazerNinho(){
        System.out.println("Fazendo o Ninho. {{{{{{OOOO}}}}}}");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
        System.out.println("Voando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Come fruta");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave.");
    }
    
}
