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
    	 	BufferedReader br=new BufferedReader(new InputStreamReader(System.in)),a=0,b=0;
    	  	int n=Integer.parseInt(br.readLine());
    	        
                while(n-->0){
                int x = Integer.parseInt(br.readLine());
                if(x==1){
                  a++;
                 }
                else {
                  b++;
                 }
               }
               if(a==b){
                  System.out.println("0");
                }
                else if(a>b){
                 System.out.println(a-b-b);
                }
               else if(b>a){
                System.out.println(b-a-a);
                }	
       }
    }
