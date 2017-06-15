import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SortIt {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      String[] unsorted = new String[n];
      for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
         unsorted[unsorted_i] = in.next();
      }
      // your code goes here
      for(int i=0; i<n; i++)
      {
         System.out.println(sortIt(unsorted,n)[i]);
      }
   
   }
   
   public static String[] sortIt(String[] unArr, int num) {
   
      for(int i=0; i<num; i++) {
         for(int j=i+1; j<num; j++){ 
            if(unArr[i].length() > 19 || unArr[j].length() > 19)
            {
               if((unArr[j].length()<unArr[i].length())) {
                  String large = unArr[i];
                  unArr[i] = unArr[j];
                  unArr[j] = large;
               }
            }
            else {
               if(Long.parseLong(unArr[j]) < Long.parseLong(unArr[i])) {
                  String large = unArr[i];
                  unArr[i] = unArr[j];
                  unArr[j] = large;
               }
            }
                 
         }
            
      }  
      return unArr;  
   }

}