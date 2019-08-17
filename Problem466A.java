    import java.util.*;
    public class Problem466A {

      static int min(int a , int b){
              if(a<=b)
                 return a;
              else 
                 return b;
        }
     
        public static void main(String[] args) {
     
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum =0,p1,p2;
            if(m*a<=b)
              System.out.println(n*a);
            else{
            p1= n/m*b +b;
            p2 = n/m*b+n%m*a;
            sum = min(p1 , p2);
            System.out.print(sum);
            }
       }
    }
