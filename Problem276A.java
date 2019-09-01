    //============================================================================
    //problem link: https://codeforces.com/problemset/problem/276/A
    // Name        : Problem330A.java
    // Author      : Shivam Dwivedi
    // Version     :
    // Copyright   : use it under your responsibility
    //status:accepted
    //============================================================================
    import java.util.*;
    import java.io.*;
    import java.util.Scanner;
     
     
    public class Problem276A {
     
        public static void main(String[] args){
         
              Scanner sc =  new Scanner(System.in);
              int n = sc.nextInt(),ans=Integer.MIN_VALUE,an=Integer.MIN_VALUE,lol=0;
              int k= sc.nextInt();
              
              for(int i=0;i<n;i++){
                 int f = sc.nextInt();
                 int t = sc.nextInt();
                 if(t<=k){
                    ans = Math.max(ans , f);
                 }
                 if(t>k){
                    lol =f+k-t;
                       an = Math.max(an,lol);
                 }
              }
              int result  = Math.max(ans,an);
              System.out.println(result);
        }
    }
