    import java.util.*;
    public class Problem165A {
     
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[][] a = new int[n][2];
            for(int i=0;i<n;i++) {
                a[i][0] = sc.nextInt();
                a[i][1] = sc.nextInt();
            }
            boolean flag1 = false , flag2 = false , flag3 = false , flag4 = false;
            int count = 0;
            for(int i = 0;i<n; i++){
                int x = a[i][0], y = a[i][1];
                flag1 = false ; flag2 = false ; flag3 = false ; flag4 = false;
                for(int j=0;j<n;j++){
                    if(i!=j){
                        if(x==a[j][0]&&y>a[j][1])
                            flag1 = true;
                        else if(x==a[j][0]&&y<a[j][1])
                            flag2 = true;
                        else if(x<a[j][0]&&y==a[j][1])
                            flag3 = true;
                        else if(x>a[j][0]&&y==a[j][1])
                            flag4 = true;
                    }
                }
                if(flag1&&flag2&&flag3&&flag4)
                    count++;
            }
            System.out.println(count);
        }
    }
