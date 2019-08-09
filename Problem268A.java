import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Problem268A {
    
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] h = new int[n];
         int[] a = new int[n];
         int count=0;
         for(int i=0;i<n;i++){
           h[i] = sc.nextInt();
           a[i] = sc.nextInt();
         }
        
         for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
                if(h[i]==a[j])
                  count++;
           }
         }
         System.out.println(count);
    }
}
