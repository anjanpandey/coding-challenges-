import java.io.*;
import java.util.*;

public class ClockConversion {

   public static void main(String[] args) {
      /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      
      Scanner scan = new Scanner(System.in);
      String input = scan.nextLine();
      String firstTwo;  
      int n = input.length()-2;
      int required;  
      System.out.println(n);
      
      if(input.charAt(n) == 'A') {
         System.out.println("This is A.");
         firstTwo = input.substring(0,2);
         required = Integer.parseInt(firstTwo);
         System.out.println(required);
         
         if(required == 12){
            System.out.print("00"+input.substring(2,(input.length()-2)));
         }
         else {
            System.out.print(firstTwo+input.substring(2,(input.length()-2)));
          
         }
      }
      
      if(input.charAt(n) == 'P') {
         firstTwo = input.substring(0,2);
         required = Integer.parseInt(firstTwo)+12;
         if ((required-12) != 12) {
            System.out.print(required+input.substring(2,(input.length()-2)));
         }
         else {
            System.out.print("12"+input.substring(2,(input.length()-2)));
         }
      }
   }
}