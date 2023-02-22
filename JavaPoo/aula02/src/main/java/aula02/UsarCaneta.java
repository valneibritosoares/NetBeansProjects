
package aula02;

public class UsarCaneta {

  
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.carga = 80;
        c1.cor = "Preta";
        c1.ponta = 0.25f;
        c1.destampar();
        c1.status();
        c1.escrever();
    }
    
}
