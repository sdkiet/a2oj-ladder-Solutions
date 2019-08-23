import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Problem476A {

     static int fun(int t2 , int t1 , int m){
            int k = t2+t1;
           if(k%m==0){ 
               return k;}
           else{
              return fun(t2-1,t1+2,m);}
    }

    public static void main(String[] args){
     
          Scanner sc =  new Scanner(System.in);
          int n = sc.nextInt();
          int m = sc.nextInt();
          int t2 = n/2;
          int t1 = n-t2*2;
          if(n<m){
            System.out.println("-1");
          }
          else if(n==m){
               System.out.println(n);
           }
          else{
                System.out.println (fun(t2, t1, m));
          }
    }
}
