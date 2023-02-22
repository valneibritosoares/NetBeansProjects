package aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampa;
    
    void status(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ponta: " + ponta);
        System.out.println("Nivel de carga: " + carga + "%");
        System.out.println("Tampado: " + tampa);
    }
    void tampar(){
        this.tampa = true;
    }
    void destampar(){
        this.tampa = false;
    }
    void escrever(){
        if(this.tampa == true){
            System.out.println("Tampa Fechada.");
            System.out.println("ERRO!!! Não pode escrever. ");
        } else {
            System.out.println("Tampa Aberta.");
            System.out.println("Escrevendo........");  
        }
    }
}
