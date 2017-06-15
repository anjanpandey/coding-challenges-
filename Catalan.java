/**
  @author Anjan Pandey on 03/04/2015
  @Title  Catalan Numbers
  @discription: determination of catalan numbers with different technique. First few methods
  are using the recurrsion which might be slow, and the last two methods are using dynamic
  programming. The program uses the concept of dynamic programming to have efficeint execution
  and better performancce. 

  */


public class Catalan
{
/**
  This methods is a recursive method to calulate the catalan number
  @param n is the number of operations
  @return reoccur_value returns the value of Catalan number 
  */
   public static long rec1(int n)
   {  
      
      int reoccur_value=0;
      if (n <= 0)
      {
         reoccur_value = 1;
      }
      else
      {
         for (int i = 0; i < n ; i++)
         {
            reoccur_value += rec1(i)*rec1(n-1-i);       
         }
      }
      return reoccur_value;
   
   }
   /**
    The below method calculate the catalna numbers using the formula suggested by Euler. This is also the
    recursive phenomenon. The loop runs until the value of n becames 0.
    @param n is the number of operations
    @return revised_value returns the revised value using the recursive solution by Euler 
   
   */
   
   public static long rec2 (int n)
   {
      long revised_value=0;
      if (n==1)
      {
         revised_value = 1;
      }
      else
      {
         revised_value =(4*n - 2) * rec2(n-1)/(n+1);
      }
      return revised_value;
   }
   /**
    The method dpr1 brings the concept of dynamic programming which solves the Catalan number
    without having to use the recursive phenomenon. It builds the adjacency matrix, and use Math.min
    method to calculate the minimum
    @param n is the number of operations
    @return (temp_dpr1[2*n][n])/(n+1) returns the values of catalan number by using the array temp_dpr1
   
   */
   public static long dpr1 (int n)
   {
      long temp_dpr1[][] = new long [2*n +1][n+1];
      int i =0, j =0;
      for(i=0; i<=2*n; i++)
      {
         for(j =0; j <= Math.min(i,n); j++)
         {
            if( j==0 || j ==i)
            {
               temp_dpr1[i][j] =1;
            }
            else
            {
               temp_dpr1[i][j] = temp_dpr1[i-1][j-1] + temp_dpr1[i-1][j];
            }
         }
      }
      return (temp_dpr1[2*n][n])/(n+1);
   }
   /**
   This method also use the dynamic programming concept which solves the formula of obtaining catalan
   number without trouble of any recursion. 
   @param n is the number of operations
   @return temp_dpr2[n] returns the value obtain by using the dynamic programing to solve catalan numbers
   */
   public static long dpr2 (int n)
   {
      long temp_dpr2[] = new long[n+1];
      temp_dpr2[0]=1;
      temp_dpr2[1]=1;
   
      for(int i=2;i<=n;i++)
      {
         temp_dpr2[i]=0;		
         for(int j=0;j<=i-1;j++)
         {
            temp_dpr2[i]+= (temp_dpr2[j]*temp_dpr2[i-1-j] );
         }
      }
   
      return temp_dpr2[n];
   
   }
}
