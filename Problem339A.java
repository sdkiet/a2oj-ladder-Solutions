import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Problem339A {

    public static void main(String[] args){
     
          Scanner sc =  new Scanner(System.in);
          String S = sc.next();
          String[] A = S.split("\\+");
          Arrays.sort(A);
          int n1=0,n2=0,n3=0;
          for(int i=0;i<A.length-1;i++){
            System.out.print(A[i] + "+");
          }  
          System.out.println(A[A.length-1]);
    }
}
