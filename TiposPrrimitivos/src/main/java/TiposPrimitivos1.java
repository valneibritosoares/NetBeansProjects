
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author VALNEI
 */
public class TiposPrimitivos1 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o Nome do Aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a Nota do Aluno: ");
        float nota = teclado.nextFloat();
        System.out.printf("A nota de %s é %.2f\n", nome , nota);
        
    }
    
}
