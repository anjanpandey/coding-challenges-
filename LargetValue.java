import java.util.*;
import java.io.*;


class LargetValue {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("How many numbers do you want to enter?");
      int capacity = scan.nextInt(); 
      int[] arr = new int[capacity];
      
      System.out.println("Enter array of non-negative integers.");
      for(int i=0; i<capacity; i++) {
         arr[i] = scan.nextInt(); 
      }
      System.out.println("The largest value in the array is "+largestValue(arr,capacity)+"."); 
   }
   
   public static int largestValue(int[] array, int n){
   
      int largest = array[0];
      for(int k=1; k<n; k++){
         if(array[k] > largest){
            largest = array[k]; 
         }
      }
      return largest; 
   }

}