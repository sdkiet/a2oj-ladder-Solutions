import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Problem208A {
    
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         String S= sc.next();
         S = S.replaceAll("WUB", " ");
         System.out.print(S);
    }
}
