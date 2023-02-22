/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author VALNEI
 */
public class RepitaFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        for (int c = 0; c <= 100; c += 5){
            if (c == 0)System.out.print("(" + c);
            else if (c > 0 && c < 100) System.out.print(" - " + c);
            else System.out.print(" - " +  c + ")");
        }
        */
        /*
        for (int i = 1; i <= 2; i++){
            for (int j = 1; j <= 2; j++){
                for (int x = 1; x <= 2; x++){
                    System.out.println(i + " " + j + " " + x);
                }
            }
        }
        */
        for (int i=0; i<=15; i+=2){
            if(i%3==0) continue;
            System.out.print(" " + i);
        }
    }
    
}
