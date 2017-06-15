
import java.io.*;
import java.util.*;

public class M {

   public static void main(String[] args) {
        
      Scanner sc=new Scanner(System.in);
      String A=sc.next();
      String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
      System.out.println(A.length()+B.length());
         
        
      char firstA = A.toUpperCase().charAt(0);
      char firstB = B.toUpperCase().charAt(0); 
      
      if(A.length() > B.length()) { 
         for(int i=0; i<B.length(); i++) {
            if(A.charAt(i) > B.charAt(i)) {System.out.println("Yes");
               break;}
            else {System.out.println("No");
               break;}}}
      else if(A.length() == B.length()){
         for(int i=0; i<B.length(); i++) {
            if(A.charAt(i) > B.charAt(i)) {System.out.println("Yes");
               break;}
            else {System.out.println("No");
               break;}}}
         
      else {
         for(int i=0; i<A.length(); i++) {
            if(A.charAt(i) > B.charAt(i)) {System.out.println("Yes");
               break;}
            else {System.out.println("No");
               break;}}}
          
      System.out.print(firstA+A.substring(1,A.length())+" "+firstB+B.substring(1, B.length()));
   }
}

