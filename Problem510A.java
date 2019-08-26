
//============================================================================
//problem link:http://codeforces.com/problemset/problem/510/A
// Name        : .java
// Author      : Shivam Dwivedi
// Version     :
// Copyright   : use it under your responsibility
//status:accepted
//============================================================================



import java.io.*;
import java.util.*;
 
public class Problem510A
{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
                int m = sc.nextInt(),i,j;

              for(i=1; i<=n; i++)
              {
                 if(i%4==2)
                 {
                   for(j=1; j<m; j++)
                   {
                    System.out.print(".");
                   }
                  System.out.println("#");
                 }
                else if(i%4==0)
                {
                  System.out.print("#");
                  for(j=1; j<m; j++)
                  {
                   System.out.print(".");
                  }
                 System.out.println("");
               }
               else
               {
                for(j=1; j<=m; j++)
                 {
                  System.out.print("#");
                  }
               System.out.println("");
               }
             }            
		
    }		
}
