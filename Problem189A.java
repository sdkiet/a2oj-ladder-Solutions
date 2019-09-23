    import java.util.*;
    public class Problem189A {
     
     
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
           int dmax=0,d,n = sc.nextInt(),a = sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
            for (int i=0; i<=n/a; ++i)
                for (int j=0; j<=n/b; ++j)
                {
                    int t=n-(i*a)-(j*b);
                    if (t>=0 && t%c==0)
                    {
                        d=i+j+(t/c);
                        if (d>dmax) dmax=d;
                    }
                }
            System.out.println(dmax);
        }
    }


