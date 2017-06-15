import java.util.*;
import java.io.*;

class Unique {

   public static void main(String[] args) {
   
      Scanner scan = new Scanner(System.in);
      System.out.println("How many numbers would you like to enter?");
      int capacity = scan.nextInt(); 
   
      int[] arr = new int[capacity]; 
   
      for(int k=0; k<capacity; k++) {
         arr[k] = scan.nextInt(); 
      } 
      
      if(isUnique(arr, capacity) == true){
         System.out.println("All elements in array are unique!!!");
      }
      else {
         System.out.println("Elements in array are not unique!!!");}
         
      System.out.println("What value would you like to search for?");
      int val = scan.nextInt(); 
     
      if(isPresent(arr,capacity,val) == true) {
         System.out.println("Your value was found!!!");
      } 
      else {
         System.out.println("The value is not in the array!!!");
      }  
   }
   
   public static boolean isUnique(int[] array, int n) {
   
      boolean uniqueNess=true; 
   
      for(int i=0; i<n; i++){
         for(int j=i+1; j<n; j++){
            if(array[i] == array[j]) {
               uniqueNess = false;    
            }
         }
      }   
   
      return uniqueNess; 
   }
   
   public static boolean isPresent(int[] ar, int c, int v) {
   
      boolean presence=false; 
      for(int m=0; m<c; m++) {
         if(ar[m] == v) {
            presence = true;
            break;  
         }
      }
      
      return presence; 
   }
   
   
}

