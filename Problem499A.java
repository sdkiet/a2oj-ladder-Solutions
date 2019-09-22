    import java.util.*;
    public class Problem499A {
     
        public static void main(String[] args) {
     
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            int watch = 0;
            int count = 0;
            for(int i=0;i<n;i++){
                int x = sc.nextInt(),y=sc.nextInt();
                while ((count+k)<x){
                    count+=k;
                }
                watch+= y - count ;
                count = y;
            }
            System.out.println(watch);
        }
    }
