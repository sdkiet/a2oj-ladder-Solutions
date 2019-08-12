    import java.util.*;
    public class Problem469A {
     
        public static void main(String[] args) {
     
            Scanner sc = new Scanner(System.in);
            int Level = sc.nextInt();
            int m = sc.nextInt(),i;
            ArrayList<Integer> AL = new ArrayList<>();
            for(i=0;i<m;i++)
                AL.add(sc.nextInt());
            m = sc.nextInt();
            for(i=0;i<m;i++)
                AL.add(sc.nextInt());
            Collections.sort(AL);
            int A=1,x=0;
            m = AL.size();
            for(i=0;i<m;i++){
                if(x<=Level&&AL.get(i)==A){
                     x = A;
                     A++;
                }
            }
            System.out.println(x==Level?"I become the guy.":"Oh, my keyboard!");
        }
    }
