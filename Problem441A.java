
//============================================================================
//problem link: https://codeforces.com/problemset/problem/441/A
// Name        : Problem330A.java
// Author      : Shivam Dwivedi
// Version     :
// Copyright   : use it under your responsibility
//status:accepted
//============================================================================



import java.io.*;
import java.util.*;
 
public class Problem441A
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i=0;i<n;i++){
            boolean check =true;
            int val = sc.nextInt();
            for(int j=0;j<val;j++){
                if(sc.nextInt()<k&&check) {
                    al.add(i + 1);
                    check = false;
                }
            }
        }
        n = al.size();
        System.out.println(n);
        for(int i=0;i<n;i++)
            System.out.print(al.get(i)+" ");
    }		

}
