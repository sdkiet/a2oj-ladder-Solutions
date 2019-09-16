    import java.util.Scanner;
     
    public class Solutsdion {
     
        public static long gcd(long m,long n){
            long  r;
            while (n != 0)
            {
                r = m % n;
                m = n;
                n = r;
            }
            return m;
        }
     
        public static void main(String[] args) {
     
            Scanner sc = new Scanner(System.in);
            long a = sc.nextLong(),b = sc.nextLong();
            if(b-a<2)
                System.out.println(-1);
            else {
                long x,y,z;
                for(long i=a;i<=b-2;i++){
                    for(long j =a+1;j<=b-1;j++){
                        for(long k =a+2;k<=b;k++){
                            if(gcd(i,j)==1&&gcd(j,k)==1&&gcd(i,k)!=1){
                                System.out.println(i+" "+j+" "+k);
                                System.exit(0);
                            }
                        }
                    }
                }
                System.out.println(-1);
            }
        }
    }
