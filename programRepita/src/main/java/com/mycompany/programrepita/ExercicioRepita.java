/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.programrepita;

import javax.swing.JOptionPane;
/**
 *
 * @author VALNEI
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // JOptionPane.showMessageDialog(null, "Olá, Mundo!", "Boas Vindas", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Olá, Mundo!", "Boas Vindas", JOptionPane.ERROR_MESSAGE);
        int n, s = 0, t =0, p = 0, i = 0, a = 0, m = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número: <br><em>(Valor 0 interrompe)</em></html>"));
            s += n;
            if (n == 0)t--;
            t++;
            if (n == 0)p--;
            if (n % 2 == 0)p++;
            else i++;
            if (n > 100)a++;
        } while (n != 0);
        m = s / t;
        JOptionPane.showConfirmDialog(null, "<html>Resultado final <hr>" 
                + "<br>Soma = " + s
                + "<br>Total = " + t
                + "<br>Par = " + p 
                + "<br>Impar = " + i 
                + "<br>Maior q 100 = " + a 
                + "<br>Media = " + m +" </html>");
    }
    
}
