import java.util.*;
import java.lang.Math; 
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
 /*
        ██╗███╗   ███╗███████╗██╗  ██╗██╗██╗   ██╗ █████╗ ███╗   ███╗██████╗ ██╗    ██╗██╗██╗   ██╗███████╗██████╗ ██╗
        ██║████╗ ████║██╔════╝██║  ██║██║██║   ██║██╔══██╗████╗ ████║██╔══██╗██║    ██║██║██║   ██║██╔════╝██╔══██╗██║
        ██║██╔████╔██║███████╗███████║██║██║   ██║███████║██╔████╔██║██║  ██║██║ █╗ ██║██║██║   ██║█████╗  ██║  ██║██║
        ██║██║╚██╔╝██║╚════██║██╔══██║██║╚██╗ ██╔╝██╔══██║██║╚██╔╝██║██║  ██║██║███╗██║██║╚██╗ ██╔╝██╔══╝  ██║  ██║██║
        ██║██║ ╚═╝ ██║███████║██║  ██║██║ ╚████╔╝ ██║  ██║██║ ╚═╝ ██║██████╔╝╚███╔███╔╝██║ ╚████╔╝ ███████╗██████╔╝██║
        ╚═╝╚═╝     ╚═╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═══╝  ╚═╝  ╚═╝╚═╝     ╚═╝╚═════╝  ╚══╝╚══╝ ╚═╝  ╚═══╝  ╚══════╝╚═════╝ ╚═╝
*/    
public class Problem373A {
     
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] cnt = new int[10];
        for (int i = 0; i < 4; i++)
          for (char c : in.next().toCharArray())
            if (c != '.')
              cnt[c - '0']++;
        System.out.println(IntStream.of(cnt).max().getAsInt() > 2 * n ? "NO" : "YES");
    }
}    
         
   
     
     

