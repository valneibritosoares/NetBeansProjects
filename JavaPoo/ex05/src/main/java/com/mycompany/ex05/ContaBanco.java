package com.mycompany.ex05;
public class ContaBanco {
    public static void main(String[] args) {
     Conta c1 = new Conta();
     c1.abrirConta("cc");
     c1.setDono("Jubileu Rodriguez");
     c1.setNumConta(12013);
     c1.depositar(180);
     c1.pagarMensal();
     c1.sacar(200);
     
     Conta c2 = new Conta();
     c2.abrirConta("cp");
     c2.setDono("Mateus Ambrozio");
     c2.setNumConta(14018);
     c2.sacar(150);
     c2.fecharConta();
     
     Conta c3 = new Conta();
     c3.abrirConta("cp");
     c3.setDono("Ane Guteberguez");
     c3.setNumConta(52089);
     c3.depositar(4000);
     c3.pagarMensal();
     c3.sacar(100);
     
     
     c1.mostraConta();
     c2.mostraConta();
     c3.mostraConta();
        
    }
    
}
