import java.util.*;
import java.io.*;
import java.math.*; 


public class BinarySearchRecursion {

   public static void main(String[] args){
   
      int[] arr = {1,2,3,4,5,6,7,8,9,10};
      System.out.println(location(arr, arr[0],arr[9]));
   
   }
   
 
   public static int location(int[] array,int low, int high){
         
      int target = 7; 
      int mid; 
   
      if(low > high){
      
         return -1; 
      
      }
      
      else {
      
         mid = (low+high)/2; 
         
         if(target == array[mid]) {
            return mid; 
         
         }
         
         else if(target < array[mid]) {
         
            return location(array, low, mid-1);
         }
         
         else {
         
            return location(array, mid+1, high);
         
         }
      
      }
   
   
   }

}