    import java.util.*;
    public class Problem501A {
        static int MAX(int p , int t ){
            return Math.max((3*p)/10,p-((p/250)*t));
        }
     
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt(),b = sc.nextInt();
            int c = sc.nextInt(),d = sc.nextInt();
            int ans1=MAX(a,c),ans2=MAX(b,d);
            if(ans1>ans2){
                System.out.println("Misha");
            }
            else if(ans1==ans2){
                System.out.println("Tie");
            }
            else{
                System.out.println("Vasya");
            }
        }
    }
