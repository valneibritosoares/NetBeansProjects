/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programmedia;

import java.util.Scanner;

/**
 *
 * @author VALNEI
 */
public class Media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
       
        System.out.println("Primeira nota: ");
        float n1 = teclado.nextFloat();
        
        System.out.println("Segunda nota: ");
        float n2 = teclado.nextFloat();
        
        float m = (n1 + n2)/ 2;
        System.out.println("Sua media foi " + m);
        
        if (m>6){
            System.out.println("Parabéns!!!");
        } else if (m==5){
            System.out.println("Recuperação!!!");
        } else {
            System.out.println("Reprovado!!!");
        }
        
    }
    
}
