
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author tersoo
 */
public class JavaApplication3 {

 
    public static void main(String[] args) {
       Scanner t= new Scanner (System.in);
       System.out.print ("enter number");
       int tersoo=t.nextInt ();
       if (tersoo==0){System.out.println ("error");}
       else if (tersoo==0){System.out.println(tersoo+"is an even number");}
       else System.out.println (tersoo+"is an odd number");
    }
    
}
