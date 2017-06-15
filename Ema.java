import java.io.*;
import java.util.*;
import java.util.Arrays; 

public class Ema 
{
   public static void main(String[] args) 
   
   {
   
      Scanner scan = new Scanner(System.in);
      int row = scan.nextInt();
      int col = scan.nextInt(); 
      char candidates=' '; 
      int area; 
      
      Character[][] letters = new Character[row][col]; 
      
      for(int a=0; a<row; a++)
      {
         for(int b=0; b<col; b++)
         {
            letters[a][b] = scan.next().charAt(0);
            
         }
      } 
            
      for(int i=0; i<row; i++)
      {
         for(int j=0; j<col; j++)
         {
            
            if((i != 0) && (j != 0) && (i != row-1) && (j != col-1 ))
            {
               candidates = letters[i][j];
               
               if(candidates == 'G'){
                  if(letters[i][j-1] == candidates && letters[i][j+1] == candidates 
                  && letters[i-1][j] == candidates &&letters[i+1][j] == candidates)
                  {
                     
                  }
               }
            }
            
         }
      }
   }
}