import java.io.*;
import java.util.*; 


class Search {

   public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);
      System.out.println("How many number/s do you want to enter?");
      int capacity = scan.nextInt();
      
      while(capacity<=1){
         System.out.println("You must enter a value greater than "+capacity+".");
         System.out.println("How many number/s do you want to enter?");
         capacity = scan.nextInt();
      }
   
      int[] numbers = new int[capacity]; 
   
      System.out.println("Please enter "+capacity+" numbers of your choice.");
      
      for(int i=0; i<capacity; i++) {
         numbers[i] = scan.nextInt(); 
      }
      
      System.out.println("Enter a number that you are looking for.");
      int target = scan.nextInt(); 
      
      for(int k=0; k<capacity; k++)
      {
         if(numbers[k]==target) {
            System.out.println("We found your number in the list.");
            break; 
               
         }
         
         if(numbers[k]!=target && k==capacity-1) {
            System.out.println("Sorry, The number is not in the list.");
         }
      
      }   
   }

}