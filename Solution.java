import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;

/*
public class Solution 

{

   public static void main(String[] args) 
   
   {
  
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int k = in.nextInt();
      int store;
      
      int a[] = new int[n];
      
      for(int a_i=0; a_i < n; a_i++)
      
      {
         a[a_i] = in.nextInt(); 
      }
    
      for (int m=0; m<k; m++) 
      
      {
         store = a[0]; 
         for (int i=0; i<n; i++) 
         
         {
            if (i != n-1) 
            
            {
               a[i] = a[i+1];  
            }
            else
            
            {
               a[i] = store; 
            } 
         }
      }
      
      for(int q=0; q<n; q++){
      System.out.print(a[q]+" ");} 
         }
}
      */
      
public class Solution {
   public static void main(String[] args) 
   {
   
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int d = scan.nextInt();
      int[] array = new int[n];
      for(int i=0; i<n;i++) {
         array[(i+n-d)%n] = scan.nextInt();
      }
      for(int i=0; i<n;i++) {
         System.out.print(array[i] + " ");
      }      
   }
}    
