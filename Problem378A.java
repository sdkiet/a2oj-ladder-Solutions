//============================================================================
//problem link: https://codeforces.com/problemset/problem/378/A
// Name        : Problem378A.java
// Author      : Shivam Dwivedi
// Version     :
// Copyright   : use it under your responsibility
//status:accepted
//============================================================================
import java.util.Scanner;

public class Main {

        static String solve(int a, int b) {
		int firstWinNum = 0;
		int drawNum = 0;
		int secondWinNum = 0;

		for (int dice = 1; dice <= 6; dice++) {
			int A = Math.abs(a - dice);
			int B = Math.abs(b - dice);

			if (A < B) {
				firstWinNum++;
			} else if (A > B) {
				secondWinNum++;
			} else {
				drawNum++;
			}
		}

		return String.format("%d %d %d", firstWinNum, drawNum, secondWinNum);
	}	
        

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(solve(a, b));

		sc.close();
	}

