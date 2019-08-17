import java.util.*;
public class Problem459A {
     
   public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);
    int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt(),x3, y3, x4, y4;
    int x_diff = x1 - x2;
    int y_diff = y1 - y2;

    if (x_diff != 0 && y_diff != 0)
    {
        x3 = x1;
        y3 = y2;
        x4 = x2;
        y4 = y1;
    }
    else if (x_diff != 0)
    {
        x3 = x1;
        y3 = y1 + Math.abs(x_diff);
        x4 = x2;
        y4 = y2 + Math.abs(x_diff);
    }
    else
    {
        x3 = x1 + Math.abs(y_diff);
        y3 = y1;
        x4 = x2 + Math.abs(y_diff);
        y4 = y2;
    }
    if(x1!=x2 && y1!=y2 && Math.abs(x1-x2)!=Math.abs(y1-y2)){
              System.out.println("-1");}
           
     else{
             System.out.println(x3+ " " + y3+ " "+ x4 + " " + y4);}
   }
}
