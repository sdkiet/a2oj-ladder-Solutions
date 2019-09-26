import java.util.*;
import java.util.stream.*;
 
 
public  class Problem389A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int count =0;
        if(count!=n-1){
             while(count!=n-1){
              count=0;
              for(int i=0;i<n-1;i++){
                   if(a[i]<a[i+1])
                       a[i+1]-=a[i];
                  else if(a[i]>a[i+1])
                        a[i]-=a[i+1];
                  else
                      count++;
              }       
            }
           int sum = IntStream.of(a).sum();
           System.out.println(sum);
        }
    }
}
