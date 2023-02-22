/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author VALNEI
 */
public class Contado1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c = 0;
        while (c <= 10) {
            c++;
            if (c == 3 || c == 4){
                continue;
            }
            if (c == 8) {
                break;
            }
            System.out.println("contar " + c);
            
        }
    }

}
