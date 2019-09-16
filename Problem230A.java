import java.util.*;
public class Problem233A
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int[] p1 = new int[n];

        for(int i=1;i<=n;i++){
             p[i]=i;
          }

        for(int i=1;i<=n;i++){
           p1[p[i]] =i;
        }

        for(int i=1;i<=n;i++){
           if(p1[p[i]]==i && p[i]==i){
               temp = p1[2*i-1]; 
               p1[2*i-1] =p1[2*i];
               p1[2*i] =temp; 
           }
         
        }

      for(int i=1;i<=n;i++){
      
       System.out.prin(p1[i]);
      }
    }
  
}
