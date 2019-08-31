import java.util.*;
public class Problem462A {
 
    public static void main(String[] args)  {
 
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        char[][] ch = new char[n][n];
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            ch[i] = s.toCharArray();
        }
        Boolean check = true;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(j-1>=0){
                    if(ch[i][j-1]=='o')
                        count++;
                }
 
                if(j+1<n){
                    if(ch[i][j+1]=='o')
                        count++;
                }
 
                if(i-1>=0){
                    if(ch[i-1][j]=='o')
                        count++;
                }
 
                if(i+1<n){
                    if(ch[i+1][j]=='o')
                        count++;
                }
                    if(count%2!=0)
                        check = false;
            }
        }
        System.out.println(check?"YES":"NO");
    }
}
