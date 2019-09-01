    //============================================================================
    //problem link: https://codeforces.com/problemset/problem/151/A
    // Name        : Problem151A.java
    // Author      : Shivam Dwivedi
    // Version     :
    // Copyright   : use it under your responsibility
    //status:accepted
    //============================================================================
    import java.util.*;
    import java.io.*;
    import java.util.Scanner;
     
     
    public class Problem151A {
     
        public static void main(String[] args){
         
              Scanner sc =  new Scanner(System.in);
              int n = sc.nextInt(), k=sc.nextInt(), l= sc.nextInt(), c=sc.nextInt();
              int d =sc.nextInt(), p = sc.nextInt(), nl= sc.nextInt(), np = sc.nextInt();  
              int ml = ((k*l/nl)/n);
              int mc = (c*d)/n;
              int mp = ((p/np)/n);
             int result = Math.min(ml,mc);
             int ans = Math.min(mp, result);
             System.out.println(ans);
        }
    }
