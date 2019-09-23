    import java.util.*;
    public class Problem350A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            int m = sc .nextInt();
            int a[] = new int[n];
            int b[] = new int[m];
            int v=0;
            for(int i=0;i<n;i++)
               a[i] = sc.nextInt();
             
             for(int j=0;j<m;j++)
               b[j] = sc.nextInt();   
               
            Arrays.sort(a);
            Arrays.sort(b);
            v =a[0];
            int p =a[n-1];
            int c= b[0];
            if(Math.max(2*v,p)<c){
                v = Math.max(2*v,p);
            }
            else{
                v=-1;
            }
            System.out.println(v);
            
        }
    }
