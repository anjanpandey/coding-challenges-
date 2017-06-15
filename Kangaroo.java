import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {

   public static void main(String[] args) 
   {
      int counter = 10000; 
      Scanner in = new Scanner(System.in);
      int x1 = in.nextInt();
      int v1 = in.nextInt();
      int x2 = in.nextInt();
      int v2 = in.nextInt();
      
      if (x1<x2 && v1<v2) 
      {
         System.out.println("NO");
      }
      
      else if (x1>x2 && v1>v2) 
      {
         System.out.println("NO");
      }
      else 
      {
         while (counter>0) {
            x1 += v1;
            x2 += v2;
            if (x1==x2) {
               System.out.println("YES");
               break; 
            }
             
          
            if (counter == 1) {
               System.out.println("NO");
            } 
            counter--;
         }
         
      }
      
      
   }  
}
