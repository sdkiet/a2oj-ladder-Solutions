//============================================================================
//problem link: https://codeforces.com/problemset/problem/456/A
// Name        : Problem330A.java
// Author      : Shivam Dwivedi
// Version     :
// Copyright   : use it under your responsibility
//status:accepted
//============================================================================
import java.util.*;
import java.io.*;
import java.util.Scanner;


public class Problem456A {

    public static void main(String[] args){
     
          Scanner sc =  new Scanner(System.in);
          int n = sc.nextInt(); 
           boolean a= false, b= false;

           for(int i=0;i<n;i++){
              int p= sc.nextInt(), q= sc.nextInt();
              if(p>q)
                  a= true;
              if(q>p)
                  b= true;
            }
            
           System.out.println(a&&b?"Happy Alex":"Poor Alex");
    }
}
