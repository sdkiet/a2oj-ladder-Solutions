    //============================================================================
    //problem link: https://codeforces.com/problemset/problem/152/A
    // Name        : Problem152A.java
    // Author      : Shivam Dwivedi
    // Version     :
    //============================================================================
    import java.util.*;
    public class Problem152A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            int s = sc .nextInt(),ans=0;
            char[][] a = new char[n][s];
            
            for(int i=0;i<n;i++)
               a[i] = sc.next().toCharArray();
            
            for(int i=0;i<n;i++){
                boolean wb = false;
                for(int j=0;j<s;j++ ){
                    boolean ib = true;
                    for(int k=0;k<n;k++){
                        if(a[k][j]>a[i][j])
                             ib = false;
                    }
                if(ib)
                   wb =true;
                }
             if(wb)
               ans++;
            }
            
         System.out.println(ans);   
        }
    }
