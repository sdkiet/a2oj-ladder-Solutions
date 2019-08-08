

    import java.util.*;
    public class Solution {
     
        public static void main(String[] args) {
     
            Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            int[] a = new int[n];
            int i,j=0,k=0;
            for(i=0;i<n;i++)
                a[i] = sc.nextInt();
            int min = a[0],max = a[0];
            for(i=1;i<n;i++){
                if(a[i]<=min)
                { min = a[i];
                    j = i;}
                 if(a[i]>max){
                     max = a[i];
                     k = i;
                }
            }
            int x = n-j+k-2;
           System.out.println(j<k?x:x+1);
        }
    }
