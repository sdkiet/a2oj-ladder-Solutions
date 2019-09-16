 //============================================================================
    //problem link: https://codeforces.com/problemset/problem/385/A
    // Name        : Problem385A.java
    // Author      : Shivam Dwivedi
    // Version     :
    // Copyright   : use it under your responsibility
    //status:accepted
    //============================================================================
    import java.util.*;
    import java.io.*;
    import java.util.Scanner;
     
     
    public class Problem385A {
     
        public static void main(String[] args){
         
              Scanner sc =  new Scanner(System.in);
              int n = sc.nextInt();
              int c = sc.nextInt(),ans=0;
              int[] a = new int[n];
              for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
              }
              for(int i=0;i<n-1;i++){
                 ans = Math.max(ans,a[i]-a[i+1]-c);
               }
             System.out.println(ans);
        }
}
