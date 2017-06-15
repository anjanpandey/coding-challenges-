import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bird {

   public static void main(String[] args) {
   	
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int[] types = new int[n];
      for (int types_i = 0; types_i < n; types_i++) {
         types[types_i] = in.nextInt();
      }
   	
      System.out.println(commonType(types,n));
   }
	
   public static int commonType(int[]types, int n){
      int type1 = 0, type2 = 0, type3 = 0, type4 = 0, type5 = 0;
      int index = 0;
   
      for (int types_i = 0; types_i < n; types_i++) {
      
         if (types[types_i] == 1) {
            type1++;
         }
      	
         if (types[types_i] == 2) {
            type2++;
         }
         if (types[types_i] == 3) {
            type3++;
         }
         if (types[types_i] == 4) {
            type4++;
         }
         if (types[types_i] == 5) {
            type5++;
         }
      }
   }
}