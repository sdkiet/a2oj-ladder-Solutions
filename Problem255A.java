import java.util.*;
 
public class Problem255A {
     
     public static void main(String[] args) {
     
            Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int chest=0,biceps=0,back=0;
            for(int i=0;i<n;i++){
               if(i%3 ==0){
                   chest += a[i];
                }
               else if(i%3==1){
                   biceps += a[i];;
               }
               else{
                  back += a[i];
               }

           }
            if(chest>=biceps){
                 if(chest>=back){

                 System.out.println("chest");
                }
                else {
                 System.out.println("back");
                 }
            }
           else if(biceps>=chest) {
                  if(biceps>=back){
                   System.out.println("biceps");
                  }
                  else{
                  System.out.println("back");
                  }
             
            }
        }
    }
