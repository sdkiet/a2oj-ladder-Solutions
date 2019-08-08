   import java.util.*;
    public class Problem263 {
     
        public static void main(String[] args) {
     
            Scanner sc = new Scanner(System.in);
            int[][] a = new int[5][5];
            int i,j,x=0;
            for(i=0;i<5;i++){
                for(j=0;j<5;j++){
                    a[i][j] = sc.nextInt();
                    if(a[i][j]==1)
                        x = Math.abs(i-2)+Math.abs(j-2);
                }
            }
            System.out.println(x);
        }
}
