import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Venotoise {

   static int whoGetsTheCatch(int n, int x, int[] X, int[] V) {
   	// Complete this function
      int distance;
      double[] time = new double[n];
      for (int i = 0; i < n; i++) {
         if (X[i] > x) {
         
            distance = X[i] - x;
            time[i] = distance / V[i];
         }
         
         else if (X[i] < x) {
            distance = x - X[i];
            time[i] = distance / V[i];
            
         } 
         else {
            return i;
         }
      
      }
      double quick = time[0];
      int index=0; 
   
      for (int k = 1; k < time.length; k++) {
         if (time[k] < quick) {
            quick = time[k];
            index=k;
         } 
         else if (time[k] > quick) {
            time[k] = time[k];
         
         } 
         else {
            index=-1;
         }
      }
   	
      return index; 
   
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
   	// Return the index of the catcher who gets the catch, or -1 if no one
   	// gets the catch.
      int n = in.nextInt();
      int x = in.nextInt();
      int[] X = new int[n];
      for (int X_i = 0; X_i < n; X_i++) {
         X[X_i] = in.nextInt();
      }
      int[] V = new int[n];
      for (int V_i = 0; V_i < n; V_i++) {
         V[V_i] = in.nextInt();
      }
      int result = whoGetsTheCatch(n, x, X, V);
      System.out.println(result);
   }
}