import java.util.*;
import java.lang.Math; 
import java.util.Arrays;
import java.util.Scanner;
 /*
        ██╗███╗   ███╗███████╗██╗  ██╗██╗██╗   ██╗ █████╗ ███╗   ███╗██████╗ ██╗    ██╗██╗██╗   ██╗███████╗██████╗ ██╗
        ██║████╗ ████║██╔════╝██║  ██║██║██║   ██║██╔══██╗████╗ ████║██╔══██╗██║    ██║██║██║   ██║██╔════╝██╔══██╗██║
        ██║██╔████╔██║███████╗███████║██║██║   ██║███████║██╔████╔██║██║  ██║██║ █╗ ██║██║██║   ██║█████╗  ██║  ██║██║
        ██║██║╚██╔╝██║╚════██║██╔══██║██║╚██╗ ██╔╝██╔══██║██║╚██╔╝██║██║  ██║██║███╗██║██║╚██╗ ██╔╝██╔══╝  ██║  ██║██║
        ██║██║ ╚═╝ ██║███████║██║  ██║██║ ╚████╔╝ ██║  ██║██║ ╚═╝ ██║██████╔╝╚███╔███╔╝██║ ╚████╔╝ ███████╗██████╔╝██║
        ╚═╝╚═╝     ╚═╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═══╝  ╚═╝  ╚═╝╚═╝     ╚═╝╚═════╝  ╚══╝╚══╝ ╚═╝  ╚═══╝  ╚══════╝╚═════╝ ╚═╝
*/    
    
         
   
     
     
public class Problem75A {
     
        public static void main(String[] args) {
           Scanner sc =new Scanner(System.in);
           int a = sc.nextInt();
           int b = sc.nextInt();
           int c = a+b;
            String g= String.valueOf(a);
            String h=String.valueOf(b);
            String i=String.valueOf(c);    
            g = g.replaceAll("0","");
            h = h.replaceAll("0","");
            i = i.replaceAll("0", "");
           
            int d = Integer.parseInt(g);
            int e = Integer.parseInt(h);
            int f = Integer.parseInt(i);
            
           
           if((a+b)==c && (d+e)==f)
              System.out.println("YES");
           else 
               System.out.println("NO");
           
        }
        
   }
