    import java.util.*;
    public class Problem488A {
     
    	public static void main(String[] args) {
    	Scanner scn= new Scanner(System.in);
    	long num=scn.nextInt();
    	
    	int i=1;
    	for(;;i++) {
    		long n=num+i;
    		boolean ans=check(n);
    		if(ans)
    			break;
    	}
    	System.out.println(i);
    	}
    	public static boolean check(long n) {
    		while(n!=0) {
    			long r=n%10;
    			if(n>0 && r==8)
    				return true;
    			else if(n<0 && r==-8)
    				return true;
    			n=n/10;
    		}
    		return false;
    	}
    }
