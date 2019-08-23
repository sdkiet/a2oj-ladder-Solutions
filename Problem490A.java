
import java.io.*;
import java.util.*;
 
public class Problem490A
{
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		Stack<Integer> prgIndecis = new Stack<Integer>();
		Stack<Integer> mathIndecis = new Stack<Integer>();
		Stack<Integer> peIndecis = new Stack<Integer>();
		
		for(int i=0;i<num;i++){
			int teamMember = in.nextInt();
			
			if(teamMember == 1)
				prgIndecis.push(i+1);
			else if(teamMember == 2)
				mathIndecis.push(i+1);
			else
				peIndecis.push(i+1);			
		}
		
		StringBuilder team = new StringBuilder();
		int numberOfTeam = Math.min(Math.min(prgIndecis.size(), mathIndecis.size()), peIndecis.size());
		team.append(numberOfTeam).append("\n");
		
		for(int i=0;i<numberOfTeam;i++)
			team.append(String.format("%d %d %d\n",prgIndecis.pop(), mathIndecis.pop(), peIndecis.pop()));
		System.out.print(team.toString());
		in.close();
	}
}
