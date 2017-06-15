import java.util.*;
import java.io.*; 

public class File {

   public static void main(String[] args){
   
      Scanner scan = new Scanner(System.in);
      //String word = "", sentence="" ; 
   /*
      do 
      {
         word = scan.next();
         sentence += word; 
      }while(!(word.equalsIgnoreCase("end-of-file.")));
   
      System.out.println(sentence);
      */
      
      for(int i=1; scan.hasNext(); i++){
      System.out.println(i+" "+ scan.nextLine());
      
      }
     
   }

}