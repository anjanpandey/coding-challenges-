import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Between {

   static int getTotalX(int[] a, int[] b){
        
      int last = a.length-1; 
      int element = a[last];
      int first = b[0];
      int count=0; 
    	
      ArrayList<Integer> candidates = new ArrayList<Integer>();
      //ArrayList<Integer> answer = new ArrayList<Integer>();
      //ArrayList<Integer> end = new ArrayList<Integer>();
         
         
      int i=2;
      int x= element; 
      while(x<=first){
         candidates.add((x));
         x=element*i; 
         i++; 
      }
      
      for(int j=0; j<candidates.size; j++){
      for(int k=0; k<b.length(); b++){
      if(b[k] % )
      
      }}
      
      return candidates.size(); 	
      
   }
    
    
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int m = in.nextInt();
      int[] a = new int[n];
      for(int a_i=0; a_i < n; a_i++){
         a[a_i] = in.nextInt();
      }
      int[] b = new int[m];
      for(int b_i=0; b_i < m; b_i++){
         b[b_i] = in.nextInt();
      }
      int total = getTotalX(a, b);
      System.out.println(total);
   }
}