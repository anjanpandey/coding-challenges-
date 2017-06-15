import java.io.*;
import java.util.*;
import java.math.*;  


public class Ana{


   static boolean isAnagram(String a, String b) {
      int total=0;
      if(a.length() > b.length() || b.length() > a.length()){
         return false;  
      } 
      else {
         for(int i=0; i<a.length(); i++){
            total += Math.pow((a.toLowerCase().charAt(i)),2); 
            total -= Math.pow((b.toLowerCase().charAt(i)),2); 
         }
        
         if(total==0) {
            return true; 
         }
         else {
            return false;
         }
      }
   }
    
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      String a = scan.next();
      String b = scan.next(); 
      scan.close();
    
      boolean ret = isAnagram(a,b); 
      System.out.println((ret) ? "Anagram" : "Not Anagrams"); 
    
   }
}