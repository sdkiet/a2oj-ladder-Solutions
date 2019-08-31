
//============================================================================
//problem link: https://codeforces.com/problemset/problem/330/A
// Name        : Problem330A.java
// Author      : Shivam Dwivedi
// Version     :
// Copyright   : use it under your responsibility
//status:accepted
//============================================================================



import java.io.*;
import java.util.*;
 
public class Problem330A
{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
                int c = sc.nextInt(),i,j=0;
                HashSet<Integer> rows,cols;

                rows= new HashSet<Integer>();
                cols= new HashSet<Integer>();
              for(i=0; i<r; i++){
                    String s = sc.next();
                      for(j=0;j<c;j++){
                           if(s.charAt(j)=='S'){
                                  rows.add(i);
                                  cols.add(j);
                           }

                      }
               }

                  System.out.print(((c-cols.size())*r)+((r-rows.size())*c)-((r-rows.size())*(c-cols.size())));
    }		

}
