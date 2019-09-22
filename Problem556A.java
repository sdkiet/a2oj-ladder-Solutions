    //============================================================================
    //problem link: https://codeforces.com/problemset/problem/556/A
    // Name        : Problem556A.java
    // Author      : Shivam Dwivedi
    // Version     :
    // Copyright   : use it under your responsibility
    //status:accepted
    //============================================================================
    import java.io.*;
    import java.io.IOException;
    import java.util.Scanner;
     
    public class Problem556A {
    	public static void main(String[] args) throws NumberFormatException, IOException {
         Scanner sc = new Scanner(System.in);
         int n;
         n = sc.nextInt();
         String s = sc.next();
         int zero=0,one=0;
         for(int i=0;i<n;i++){
             if(s.charAt(i) == '0'){
                 zero++;
             }
             else{
                 one++;
             }
       }
       System.out.println(Math.abs(one-zero));
       }
    }
