    import java.util.*;
    public class Problem337A {
     
        public static void main(String[] args) {
     
            Scanner sc = new Scanner(System.in);
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int[] a = new int[n2];
            for(int i=0;i<n2;i++)
                a[i] = sc.nextInt();
            Arrays.sort(a);
            int min =Integer.MAX_VALUE ;
            for(int i=0;i<n2-n1+1;i++){
                int x = a[i+n1-1]-a[i];
                if(x<min)
                    min = x;
            }
            System.out.println(min);
        }
    }
