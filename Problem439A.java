

    import java.util.*;
    public class Problem439A {
     
        public static void main(String[] args) {
     
            Scanner sc = new Scanner(System.in);
            int n =sc.nextInt() , t = sc.nextInt(),sum=0,ts=0,tt=0,nj;
            int[] s = new int[n];
            for(int i=0;i<n;i++){
                s[i] = sc.nextInt();
            }
            for(int i=0;i<n-1;i++)
               sum += s[i]+10;
 
             sum = sum+s[n-1];
            for(int i=0;i<n;i++)
                 ts += s[i];
            
           if(sum>t)
              System.out.println("-1");
           else {
               tt = t-ts;
               nj = tt/5;
            System.out.println(nj);
           }
        }
    }
