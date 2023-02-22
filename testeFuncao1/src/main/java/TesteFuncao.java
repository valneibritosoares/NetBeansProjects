/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author VALNEI
 */
public class TesteFuncao {
    //Função sem retorno.
    static void soma (int a, int b){
        int s = a + b;
        System.out.println("È = " + s);
    }
    //Função com retorno.
    static int dividir (float a, int b){
        float d = a / b;
        return (int) d;
    }
    //Função com retorno.
    static float dividir2 (float a, float b){
        float d = a / b;
        return d;
    }
     //Função com retorno.
    static int dividir3 (int a, int b){
        int d = a / b;
        return d;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Vamos começar ");
        soma(5,8);
        int r = dividir(4,3);
        System.out.println("Dividir é " + r);
        float r2 = dividir2(4,3);
        System.out.println("Dividir 2 é " + r2);
        int r3 = dividir3(114,3);
        System.out.println("Dividir 3 é " + r3);
        System.out.println("Vamos começar a contagem.");
        System.out.println(Operacoes.contador(r, r3));
        String v = Operacoes.contador(1, 48);
        System.out.println("Vamos começar a contagem nova.");
        System.out.println(v);
    }
    
}
