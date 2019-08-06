import java.io.*;

public class Problem122A {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    
    public static void main(String[] args) throws IOException {
        int[] lucky = {4, 7, 44, 47, 444, 447, 474, 477, 744, 747, 774, 777};
        
        int inp = Integer.parseInt(br.readLine());
        boolean almostLucky = false;
        
        for(int i = 0; i < lucky.length; i++) {
            if(inp % lucky[i] == 0) {
                almostLucky = true;
                break;
            }
        }
        if(almostLucky) pw.println("YES");
        else pw.println("NO");
        
        pw.close();
    }
}
