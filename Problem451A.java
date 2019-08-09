import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Problem451A {
    
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int m = sc.nextInt();
         int x = n<m?n:m;
        if(x%2==0)
          System.out.print("Malvika");
        else
          System.out.println("Akshat");
  
    }
}
