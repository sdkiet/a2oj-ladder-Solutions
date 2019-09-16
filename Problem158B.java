    //============================================================================
    //problem link: https://codeforces.com/problemset/problem/158/B
    // Name        : Problem158B.java
    // Author      : Shivam Dwivedi
    // Version     :
    // Copyright   : use it under your responsibility
    //status:accepted
    //============================================================================
    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
     
    public class Problem158B {
    	public static void main(String[] args) throws NumberFormatException, IOException {
    		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    		int n=Integer.parseInt(br.readLine());
    		int ar[]=new int[n];
    		String [] s=br.readLine().split(" ");
    		for(int i=0;i<n;i++)
    		 ar[i]=Integer.parseInt(s[i]);
    		 int count[]=new int[5];
    			
    		for(int i=0;i<n;i++) {
    			count[ar[i]]++;
    		}
    		
    	   
    		int ans=count[4];
    		if(count[3]>count[1]) {
    			count[1]=0;
    			ans+=count[3];
    		}
    		else
    		{
    			ans+=count[3];
    			count[1]=count[1]-count[3];
    		}
    		
    		ans+=(Math.ceil((count[2]*2+count[1])/4.0));
    		
    	System.out.println(ans);
    }
    }
