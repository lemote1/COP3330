package encryptdecrypt;
 
import java.util.Scanner;
public class Encrypt {
 
    public static void main(String[] args) {
          Scanner scnr = new Scanner(System.in);
          int a;
          int b;
          int c;
          int d;
         
          System.out.println("Enter 4 integers:");
          
          a = scnr.nextInt();
          b = scnr.nextInt();
          c = scnr.nextInt();
          d = scnr.nextInt();

         a = (a + 7) % 10;
         b = (b + 7) % 10;
         c = (c + 7) % 10;
         d = (d + 7) % 10;
         
         System.out.print("Encrypted output: ");
         System.out.print(c + "" + d + "" + a + "" + b + "");
    }
 
}