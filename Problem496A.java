    import java.util.*;
     
    public class Problem496A {
         
         public static void main(String[] args) {
         
                Scanner sc = new Scanner(System.in);
                int n =sc.nextInt();
                int min = Integer.MAX_VALUE;
                int[] a = new int[n];
                for(int i=0;i<n;i++){
                    a[i] = sc.nextInt();
                }
                for(int i=1;i<n-1;i++){
                    int max = 0;
                    int prev = 0;
                    for(int j=1 ; j < n; j++ ){
                        if(j!=i) {
                            max  = Integer.max(max,a[j]-a[prev]);
                            prev = j;
                        }
                    }
                    min = Integer.min(max,min);
                }
                System.out.println(min);
            }
        }
