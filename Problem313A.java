    import java.util.*;
    public class Problem313A {
     
        public static void main(String[] args) {
     
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(),t1,r,t2;
            if(n>=0)
               System.out.println(n);
            else{
             t1 = n/10;

             r = n%10;
             n = n/100;
             t2 = n*10+r;
             System.out.println(t1<t2?t2:t1);
            }
       }
    }
