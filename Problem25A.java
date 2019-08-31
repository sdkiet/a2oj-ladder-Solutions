
//============================================================================
//problem link:https://codeforces.com/problemset/problem/25/A
// Name        : .java
// Author      : Shivam Dwivedi
// Version     :
// Copyright   : use it under your responsibility
//status:accepted
//============================================================================



    import java.util.*;
    public class Problem25A {
     
        public static void main(String[] args) {
     
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int even = 0,odd=0;
            int posEven=0,posOdd=0;
            for(int i =0 ;i<n;i++){
                if(sc.nextInt()%2==0){
                    even++;
                    posEven = i+1;
                }
                else{
                    odd++;
                    posOdd = i+1;
                }
            }
            System.out.println(even>odd?posOdd:posEven);
        }
    }
