import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Candles {

    public static void main(String[] args) {
        int tallest,count=0; 
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        
        tallest = height[0]; 
        if (n==1) {
            System.out.print(1); 
        }
        
        else {
            for (int i=1; i<height.length; i++) {
                if (tallest<height[i]){
                  tallest = height[i];   
                }
                
            }
            int o =0; 
            while (o <height.length) {
            if (tallest == height[o]) {
            count++; 
            }
            o++; 
            }
            
        }
        System.out.print(count);
    }
}