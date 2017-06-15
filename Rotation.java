import java.io.*;
import java.util.*;

public class Rotation {

   public static void main(String[] args) 
   {
      Scanner scan = new Scanner(System.in);
      
      int num = scan.nextInt();
      int rotation = scan.nextInt(); 
      int[] store = new int[num]; 
      int i=0,j=0;
         
      while(i<num) 
      {
         store[i] = scan.nextInt(); 
         i++;
      }
        
      while(j<rotation) 
      {
         int save = store[0];
         
         for(int k=0; k<num; k++)
         {
            if (k < store.length-1) 
            {
               store[k] = store[k+1]; 
            }
            if (k == store.length-1)
            {
               store[k] = save; 
            }
         } 
         j++;
      }
      
      for(int m=0; m<num; m++) 
      {
         System.out.print(store[m]+" ");
      }
      
   }
}