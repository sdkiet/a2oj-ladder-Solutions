       import java.util.*;
        public class Problem443A {
         
            public static void main(String[] args) {
         
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
                char[] c = s.toCharArray();
                Arrays.sort(c);
                int A=0;
                l=c.length;
                for(int i=0;i<l-1;i++){
                    if((c[i]<='z')&&(c[i]>='a')){
                        if(i>0&&c[i]!=c[i-1])
                           A++;
                        if(i==0)
                            A++;
                    }
                }
                System.out.println(A);
            }
        }
