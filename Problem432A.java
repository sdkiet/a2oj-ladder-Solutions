
//============================================================================
//problem link: https://codeforces.com/problemset/problem/432/A
// Name        : .java
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
		int n = sc.nextInt();
                int k = sc.nextInt(),i,j=0;
                int[] a = new int[n];
              for(i=0; i<n; i++)
                 a[i] = sc.nextInt();
                        
	        for(i=0;i<n;i++){
 
                  if(5-a[i]>=k){
                     j++;
                   }
               }
               int teams = j/3;
               System.out.println(teams);
    }		

}
