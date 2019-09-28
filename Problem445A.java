 import java.util.*;
 import java.lang.Math; 
     /*
            ██╗███╗   ███╗███████╗██╗  ██╗██╗██╗   ██╗ █████╗ ███╗   ███╗██████╗ ██╗    ██╗██╗██╗   ██╗███████╗██████╗ ██╗
            ██║████╗ ████║██╔════╝██║  ██║██║██║   ██║██╔══██╗████╗ ████║██╔══██╗██║    ██║██║██║   ██║██╔════╝██╔══██╗██║
            ██║██╔████╔██║███████╗███████║██║██║   ██║███████║██╔████╔██║██║  ██║██║ █╗ ██║██║██║   ██║█████╗  ██║  ██║██║
            ██║██║╚██╔╝██║╚════██║██╔══██║██║╚██╗ ██╔╝██╔══██║██║╚██╔╝██║██║  ██║██║███╗██║██║╚██╗ ██╔╝██╔══╝  ██║  ██║██║
            ██║██║ ╚═╝ ██║███████║██║  ██║██║ ╚████╔╝ ██║  ██║██║ ╚═╝ ██║██████╔╝╚███╔███╔╝██║ ╚████╔╝ ███████╗██████╔╝██║
            ╚═╝╚═╝     ╚═╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═══╝  ╚═╝  ╚═╝╚═╝     ╚═╝╚═════╝  ╚══╝╚══╝ ╚═╝  ╚═══╝  ╚══════╝╚═════╝ ╚═╝
    */    
        
        public class Problem445A {
         
        	public static void main(String[] args) {
        	  Scanner sc= new Scanner(System.in);
        	   int a=0;
        	   int n = sc.nextInt();
        	   int m = sc.nextInt();
               String C[] = new  String[n+1];
               
               for(int i=0;i<n+1;i++){
                   C[i] = sc.nextLine();
               }
               
               for(int i=0;i<=n;i++){
                   if(i%2==0)
                      a = 1;
                   else 
                      a = 2;
                  for(int j=0;j<C[i].length();j++){
                     if(a==2){
    			         char ch=C[i].charAt(j);
    					if(ch=='-')
    						System.out.print("-");
    					else if(j%2==0)
    						System.out.print("B");
    					else
    						System.out.print("W");
                     } 
                     else {
                         char ch = C[i].charAt(j);
                         if(ch=='-')
                           System.out.print("-");
                         else if(j%2==0)
                            System.out.print("W");
                         else 
                            System.out.print("B");
                     }
                  }
                  a=0;
                  System.out.print('\n');
               }
        	}
        }


