
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author VALNEI
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0;
        String res;
        Scanner tecl = new Scanner(System.in);
        do {
            System.out.println("Digite um número: ");
            n = tecl.nextInt();
            s += n;
            System.out.println("Quer continuar? [s/n] ");
            res = tecl.next();
        } while (res.equals("s"));
        System.out.println("A soma de todos os valores é " + s);
    }
    
}
