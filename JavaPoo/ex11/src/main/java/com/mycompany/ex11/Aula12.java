package com.mycompany.ex11;
public class Aula12 {
    public static void main(String[] args) {
        Linha l = new Linha("==================================");
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Cachorro c = new Cachorro();
        Canguru k = new Canguru();
        k.locomover();
        k.emitirSom();
        l.linhas();
        c.setCorPelo("Branco Neve.");
        System.out.println("Cão com a cor de pelo " + c.getCorPelo());
        c.locomover();
        c.alimentar();
        c.abanaRabo();
        c.emitirSom();
        l.linhas();
        
        c.reagir("mau");
        c.reagir(21,00);
        c.reagir(false);
        c.reagir(17, 4.5f);
        l.linhas();
        l.linhas();
        p.setCorEscama("Dourado");
        System.out.println("Peixe com a cor da escama " + p.getCorEscama());
        p.locomover();
        p.alimentar();
        p.soltarBolha();
        p.emitirSom();
        l.linhas();
        
        
        
    }
    
}
