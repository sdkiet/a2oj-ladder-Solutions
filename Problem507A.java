
//============================================================================
//problem link:http://codeforces.com/problemset/problem/507/A
// Name        : .java
// Author      : Shivam Dwivedi
// Version     :
//status:accepted
//============================================================================



import java.io.*;
import java.util.*;
 
public class Problem507A
{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
                int k = sc.nextInt();
                int[] a = new int[n];
                ArrayList<Integer> ans = new ArrayList<Integer>(n);
                for(int i=0;i<n;i++)
                       a[i] = sc.nextInt();
                 
                 Arrays.sort(a);
                for(int i=0;i<n;i++){
                   if(k<a[i])
                        break;

                   ans.add(i+1);
                    k -=a[i];
                }             
		System.out.println(ans.size());

                 for(int i=0;i<ans.size();i++){
                     System.out.println(ans.get(i));   
                 }
    }		
}
