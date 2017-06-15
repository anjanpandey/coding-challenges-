import java.io.*;
import java.util.*;

public class S {

   public static void main(String[] args) {
     
      Scanner scan = new Scanner(System.in);
      String input = scan.nextLine(); 
      int length = scan.nextInt();
      
      String containerL = input.substring(0,length);//, max= input.substring(0,length), store="";
      String storeL="";  
      String containerM = input.substring(0,length);
      String storeM="";
      
      for(int i=1; i<=input.length()-length; i++){
         storeL = input.substring(i, i+length);
         storeM = input.substring(i, i+length);
       
         for(int j=0; j<length; j++){
            if(storeL.charAt(j) < containerL.charAt(j)){
               containerL = storeL;
               break;  
            }
            else if (storeL.charAt(j) == containerL.charAt(j)) {
               containerL = containerL; 
            }
            else {
               break;
            }
         }
         
         for(int k=0; k<length; k++){
            if(storeM.charAt(k) > containerM.charAt(k)){
               containerM = storeM;
               break;  
            }
            else if (storeM.charAt(k) == containerM.charAt(k)) {
               containerM = containerM; 
            }
            else {
               break;
            }
         }
       
      }
      
      System.out.println(containerL);
      System.out.println(containerM);
   }
   
   /*
ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs
30

ASDFHDSFHsdlfhsdlfLDFHSDLFHsdl
sdlkfhsdlfhsLFDLSFHSDLFHsdkfhs
  */
}

/*
      for(int i=1; i<=input.length()-length; i++){
         store = input.substring(i, i+length);
         
         for(int j=0; j<length; j++){
      
            if(store.charAt(j) == least.charAt(j)){
               continue; 
            }
            
            if(store.charAt(j) == max.charAt(j)){
               continue; 
            }
            
            if(store.charAt(j) > least.charAt(j)){
               least = least; 
               break; 
            }
            
            
            if(store.charAt(j) < max.charAt(j)) {
               max=max;
               break;  
               
            }
                  if(store.charAt(j) < least.charAt(j)){
               least = store;
               break; 
            }
            if(store.charAt(j) > max.charAt(j)) {
               max = store; 
               break; 
            }
            
            
         }
      }




*/