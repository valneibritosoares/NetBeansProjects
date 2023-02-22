package aula02;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampa;
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Nivel de carga: " + this.carga + "%");
        System.out.println("Tampado: " + this.tampa);
    }
    public void tampar(){
        this.tampa = true;
    }
    public void destampar(){
        this.tampa = false;
    }
    public void escrever(){
        if(this.tampa == true){
            System.out.println("Tampa Fechada.");
            System.out.println("ERRO!!! Não pode escrever. ");
        } else {
            System.out.println("Tampa Aberta.");
            System.out.println("Escrevendo........");  
        }
    }
}
