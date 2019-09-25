        import java.util.*;
        public class Problem353A {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt(),sum1=0,sum2=0;;
                int[][] x = new int[n][2];
                for(int i=0;i<n;i++){
                 x[i][0] = sc.nextInt();
                 x[i][1]=sc.nextInt();
                 sum1 +=x[i][0];
                 sum2 +=x[i][1];
                }
                if(sum1%2==0 && sum2%2==0){
                    System.out.println(0);
                    System.exit(0);
                }
                int t=0;
                if(sum1%2!=0 && sum2%2==0 || sum1%2==0 && sum2%2!=0 || sum1%2!=0 && sum2%2!=0){
                    for(int i=0;i<n;i++){
                        int temp=0;
                        if(x[i][0]%2==0 && x[i][1]%2!=0 || x[i][0]%2!=0 && x[i][1]%2==0){     
                            temp = x[i][0];
                            x[i][0]=x[i][1];
                            x[i][1]=temp;
                            sum1 += x[i][0]-x[i][1];
                            sum2 += x[i][1]-x[i][0];
                            t++;
                           if(sum1%2!=0 || sum2%2!=0){
                              continue;
                           }
                           else{
                              System.out.println(t); 
                              break;
                           }
                        }   
                    }
                  if(sum1%2!=0 ||sum2%2!=0){
                        System.out.println(-1);
                   }    
                }        
                
            }
        }        
        
