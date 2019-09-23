package encryptdecrypt;
 
import java.util.Scanner;
public class Decrypt {
 
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

         a = (a + 3) % 10;
         b = (b + 3) % 10;
         c = (c + 3) % 10;
         d = (d + 3) % 10;
         
         System.out.print("Decrypted output: ");
         System.out.print(c + "" + d + "" + a + "" + b + "");
    }
 
}