
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author VALNEI
 */
public class tes2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* int c = 1;
        do{
           if (c % 5 != 0)System.out.println(c);
        else break;
        c+=1; 
        } while (c <= 10);
        */
       Date d = new Date();
       SimpleDateFormat f = new SimpleDateFormat("YYYY");
       //String dt = f.format(d);
       int dt = Integer.parseInt(f.format(d));
       int ts = dt + 8;
       System.out.println(ts);
       /*
       Y Year
       M Month in year
       D Day in year
       d Day in month
       H Hour in day
       h Hour in am/pm
       m Minute in hour
       s Second in minute
       S Millisecond Number
       */
       
        
    }
    
}
