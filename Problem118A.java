//String Task
import java.util.Scanner;

public class Problem118A {
	
	static Scanner sr = new Scanner(System.in);
	public static void main(String args[])
	{
	   String S = sr.nextLine();
            S = S.replaceAll("[AEIOUYaeiouy]", "");
            S = S.toLowerCase();
            for(int i=0;i<S.length();i++){
                System.out.print(".");
                System.out.print(S.charAt(i));               
            }
	}


}
