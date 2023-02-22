/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author VALNEI
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int n = 12;
        int f = 1;
        int c = n;
        System.out.print(n);
        System.out.print("! = ");
        while (c >= 1){
           f *= c;
           System.out.print(c);
            c--;
            if (c >= 1){
                System.out.print(" x ");  
            } else {
                  System.out.print(" = ");
            }
          
             
        }
        System.out.print(f);
    */
        int v[] = {2,0,3,9};
        v[v[2]] = v[v[1]];
        for (int i: v){
            System.out.println(i + " ");
        }
        
       String s = "CURSOEMVIDEO";
       char [] r = new char[12];
       for (int c=s.length()-1; c>=0; c--){
           r[c] = s.charAt(c);
       }
       for (char l: r){
           System.out.print(l);
       }
    }
    
}
