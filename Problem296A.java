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
public class Problem296A {
     
        public static void main(String[] args) {
           Scanner sc =new Scanner(System.in);
           int a = sc.nextInt();
           int A[] = new int[a];
           
           for(int i=0;i<a;i++)
              A[i] = sc.nextInt();
           int max=0;
           for(int i=0;i<a;i++){
               int count=0;
               for(int j=0;j<a;j++){
                   if(A[i]==A[j])
                     count++;
               }
               if(count>=max)
                   max = count;
           }
           if(max<=(a+1)/2)
              System.out.println("YES");
           else
              System.out.println("NO");
        }
        
   }
