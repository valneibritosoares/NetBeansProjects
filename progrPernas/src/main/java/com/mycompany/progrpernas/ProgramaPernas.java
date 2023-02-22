/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.progrpernas;

import java.util.Scanner;

/**
 *
 * @author VALNEI
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.println("Quantas pernas?");
        int perna = tec.nextInt();
        String tipo;
        //System.out.print("Isso é: ");
        tipo = switch (perna) {
            case 1 -> "Saci";
            case 2 -> "Bipede";
            case 3 -> "Tripé";
            case 4 -> "Quadrúpede";
            case 6 -> "Aranha";
            default -> "ET";
        };
        System.out.println("Isso é " + tipo + ". Tem " + perna + " perna(s)");
               
    }
    
}
