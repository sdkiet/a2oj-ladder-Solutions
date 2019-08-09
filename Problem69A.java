    import java.util.*;
    public class problem69A {
     
        public static void main(String[] args) {
     
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sumx = 0,sumy=0,sumz=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<3;j++){
                    if(j==0)
                        sumx+=sc.nextInt();
                    else if(j==1)
                        sumy+=sc.nextInt();
                    else
                        sumz+=sc.nextInt();
                }
            }
            System.out.println((sumx==0&&sumy==0&&sumz==0)?"YES":"NO");
        }
    }
