//Petya String
import java.util.*;
import java.io.*;


public class Problem112A {

    public static void main(String[] args) {
       
       
        Scanner in = new Scanner(System.in);
        String first = in.next();
        String second = in.next();
       
         first = first.toLowerCase();
         second = second.toLowerCase();
       
        
       
        if(first.compareTo(second) ==0){
            System.out.println("0");
        }
        if(first.compareTo(second) > 0){
            System.out.println("1");
        }
        if(first.compareTo(second) < 0){
            System.out.println("-1");           
        }
    }
}
