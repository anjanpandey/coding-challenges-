import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Large {

   public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);
      String first = scan.next();
      String second = scan.next(); 
      
      BigInteger big_Int_First = new BigInteger(first);
      BigInteger big_Int_Second = new BigInteger(second);
   
      System.out.println(big_Int_First.add(big_Int_Second));
      System.out.println(big_Int_First.multiply(big_Int_Second));
      
   }
}