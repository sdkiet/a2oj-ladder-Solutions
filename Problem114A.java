    import java.util.*;
    public class Problem114A{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int k = sc.nextInt();
            int l = sc.nextInt();
            int count=0;
            while(l%k==0){
                l/=k;
                count++;
            }
            if(l==1){
                System.out.println("YES");
                System.out.println(count-1);
            }
            else
                System.out.println("NO");
        }
    }
