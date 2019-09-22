    import java.util.*;
    public class Problem262A {
        
        static int nod(int t){
            if(t==0){
                return 0;
            }
            else if(t>=1 && t<9){
                return 1;
            }
            else{
                return 1+nod(t/10);
            }
        }
     
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(),b=n,ans=0;
            int k = sc.nextInt();
            while(n-->0){
                int t = sc.nextInt(),count=0,r=0;
                int nd = nod(t); 
                while(nd-->0){
                    r = t%10;
                    if(r==4||r==7){
                        count++;
                    }
                    t= t/10;
                }
                if(count>k){
                    ans +=1;
                }
            }
         System.out.println((b-ans));
        }
    }
