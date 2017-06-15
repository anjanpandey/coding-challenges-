import java.util.*;
import java.io.*;
import java.math.*; 
import java.util.Arrays; 


public class MergeSortRecursion 

{
   public static void main(String[] args){
   
   /*
      Scanner scan = new Scanner(System.in);
      System.out.println("How many numbers would you like to enter?");
      int capacity = scan.nextInt(); 
      
      int[] unSorted = new int[capacity]; 
      
      for(int i=0; i<capacity; i++) {
      
         unSorted[i] = scan.nextInt(); 
      
      }
      */ 
      int[] unSorted= {5, 3, 7, 0, 1, 3, 2, 10, 9}; 
      int capacity = unSorted.length-1; 
      System.out.println("MergeSort By Recursive Method");
      mergeSort(unSorted,0,capacity); 
      
      for(int i=0; i<capacity+1; i++)
         System.out.print(unSorted[i]+" "); 
           
   }
      
      
   public static void mergeSort(int[] arra, int left, int right) {
      int mid; 
      
      if(right>left)
      {
         mid= (right+left)/2;
         mergeSort(arra,left,mid);
         mergeSort(arra,(mid+1),right);
         merge(arra,left,(mid+1),right);  
      }
      
   }
   
   public static void merge(int[] numbers,int left, int mid, int right) {
      
      int[] temp = new int[25];
      
      int i, left_end, num_elements, tmp_pos;
      
      left_end = (mid-1);
      tmp_pos = left;
      num_elements = (right-left+1); 
      
   
      while((left <= left_end)&&(mid <= right)) {
         if(numbers[left] <= numbers[mid])
            temp[tmp_pos++] = numbers[left++];
         else 
            temp[tmp_pos++] = numbers[mid++]; 
          
      }
      
      while(left <= left_end)
         temp[tmp_pos++] = numbers[left++];
         
      while (mid <= right) 
         temp[tmp_pos++] = numbers[mid++];
      
      for(i=0; i<num_elements; i++){
      
         numbers[right] = temp[right];
         right--; 
      
      }
   }
}
   
