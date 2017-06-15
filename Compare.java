import java.io.*;
import java.util.*; 


class Compare {

   public static void main(String[] args) {
   
      int y1, y2,count=1; 
   
      for(int n=10; n<=100000; n+=10){
      
         y1 = 100*n+10; 
         y2 = 5*n*n+2; 
         
         if(y1>y2){
            System.out.println("y1 won in "+count+" iteration with value of "+y1+"."); 
         }
         else if(y1==y2){
            System.out.println("They have same value in "+count+" iteration, and the value is "+y1+".");
         }
         else {
            System.out.println("y2 won in "+count+" iteration with value of "+y2+".");  
         }
         count++; 
      
      }
   
   }
   
   
}