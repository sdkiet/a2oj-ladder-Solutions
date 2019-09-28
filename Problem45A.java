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
    
         
   
     
     
public class Football {
     
        public static void main(String[] args) {
           Scanner in=new Scanner(System.in);
           int n=in.nextInt();
           int c=1,c1=0;
           boolean f=false;
           String s="";
          String A[]= new String [n];
            for (int i = 0; i < n; i++) {
                 A[i]=in.next();
            }
          
            for (int i=0;i<A.length;i++) {
                if (A[0].equals(A[i])){
                    c++;
                }
                else{
                    s=A[i];
                    c1++;
                }
            }
            if(c>c1)
                   System.out.println(""+A[0]);
            else
                System.out.println(""+s);
           
        }
        
   }
