import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.lang.*;

public class Problem58A {

    public static void main(String[] args){
     
          Scanner sc =  new Scanner(System.in);
          String S = sc.next();
          Character[] hello  = {'h','e','l','l','o'};
          int index=0;
          char lookingfor = hello[index];
          for(char c:S.toCharArray()){
                  if(c==lookingfor && index==4){
                     System.out.println("YES");
                     return;
                  }
                 else if(c==lookingfor){
                       index++;
                       lookingfor =hello[index];
                  }
                    
          }
        System.out.println("NO");
    }  
}
