import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Set;   


public class List {

   public static void main(String[] args) {
   
      ArrayList<String> myLife = new ArrayList<String>(); 
      replace(myLife, "","");
     
   }
   
   public static void replace(ArrayList<String> myList, String oldItem, String newItem) {
   
      myList = new ArrayList<String>();
      Set<String> filter = new HashSet<String>();
      
   	//System.out.println(myList.size()); 
      
      myList.add("Bashful");
      myList.add("Awful");
      myList.add("Jumpy");
      myList.add("Happy");
     //System.out.println(myList.size());
      myList.add(2, "Doc");
      //System.out.println(myList);
      //System.out.println(myList.indexOf("cute")); [for those item not on the list!]      
      myList.add("Jumpy");
      myList.add("Love");
      myList.add("Campy");
      myList.add("Bashful");
      
      System.out.println(myList);
      Scanner scan = new Scanner(System.in);
      
      for(String list : myList) {
      
         if(filter.add(list) == false) {
            System.out.println("What would you like to change "+list+" to?");
            newItem = scan.nextLine();
            myList.set(myList.indexOf(list), newItem); 
         }
      
      }
      
      System.out.println(myList);
      System.out.println(filter); 
      
   }
}