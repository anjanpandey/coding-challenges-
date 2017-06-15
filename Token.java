import java.io.*;
import java.util.*;

public class Token {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String s = scan.nextLine(); 
      scan.close();
      String[] tokens = {}; 
      
      if(s!= null && !s.trim().isEmpty() && s.length() < 400000)
      {
         tokens = s.trim().split("[ !,.?_'@]+");
         
      }
      System.out.println(tokens.length);
      for(String token: tokens) {
         
         System.out.println(token); }
      
   }
}
