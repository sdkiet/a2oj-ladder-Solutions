    //============================================================================
    //problem link: https://codeforces.com/problemset/problem/404/A
    // Name        : Problem404A.java
    // Author      : Shivam Dwivedi
    // Version     :
    // Copyright   : use it under your responsibility
    //status:accepted
    //============================================================================
    import java.util.*;
    import java.io.*;
    import java.util.Scanner;
    public class Problem404A {
     
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        char[][] ch = new char[n][n];
        for(int i=0;i<n ;i++)
            ch[i] = sc.nextLine().toCharArray();
        int c = ch[0][0],d=ch[0][1];
        int index = 0;
        boolean flag = false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j||j==(n-1-i)){
                    if(ch[i][j]!=c)
                        flag = true;
                }
                else {
                    if(ch[i][j]!=d)
                        flag = true;
                }
            }
        }
        if(c==d)
            flag = true;
        System.out.println(flag?"NO":"YES");
        }
   }
