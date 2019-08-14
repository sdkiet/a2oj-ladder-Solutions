    import java.util.*;
    public class Problem318A {
     
        public static void main(String[] args) {
     
            Scanner sc = new Scanner(System.in);
            long n = sc.nextLong();
            long k = sc.nextLong(),x;
           if(n%2==0){
             if(k<=n/2)
                x  = 2*(k-1)+1;
             else
                x = 2*(k-n/2);
           }
          else{
             if(k<=n/2+1)
                 x = 2*(k-1)+1;
             else
                 x = 2*(k-n/2-1);
          }
            System.out.println(x);
        }
    }
