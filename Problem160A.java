import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Problem160A {

    public static void main(String[] args){
     
          Scanner sc =  new Scanner(System.in);
          int N = sc.nextInt();
          int[] A  = new int[N];
          int sum= 0;
          for(int i=0;i<N;i++){
            A[i]= sc.nextInt();
            sum += A[i];
           }
          sum = sum/2;
          Arrays.sort(A);
          int k= 0,k1=0;
          for(int i=N-1;i>0;i--){
                  k1 += A[i];
                if(k1>sum)
                  break;
                else
                  k++;
           }
        System.out.println(k+1);
    }  
}
