    import java.util.*;
    public class Problem469A {
     
        public static void main(String[] args) {
     
            Scanner sc = new Scanner(System.in);
             int n = sc.nextInt();
             int x= sc.nextInt();
             int[] X  = new int[x];
             int y =sc.nextInt();
             int[] Y = new int[y];
             for(int i=0;i<n;i++)
                X[i] = sc.nextInt();
            
           
             
             for(int i=0;i<y;i++)
               Y[i] = sc.nextInt();

             int y1=0,x1=0;
              for(int j=0;j<y;j++){
                    if(Y[j]==n){
                      y1= 1;
                     }
              }
             for(int i=0;i<x;i++){
               
 
                if(X[i] ==n)
                  x1=1;
                  
              }
            if(x1==1 || y1==1)
                System.out.println("I become the guy .");
            else
                System.out.println("Oh, my keyboard!"); 
        }
    }
