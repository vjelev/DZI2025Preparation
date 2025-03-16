package zad25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IsNumDivisibleByDigits {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		List<Integer> numsOccured = new ArrayList<Integer>();
		
		try {
			int numInput = Integer.parseInt(inp.nextLine());
			int initialNum = numInput;

			while (numInput != 0) {
				int num = numInput % 10;
				if (!numsOccured.contains(num)) {
					numsOccured.add(num);
				}
				numInput = numInput / 10;
			}
			boolean doesNumDivide = true;

				for (int a : numsOccured) {
					if(a==0) {
						doesNumDivide = false;
						break;
					}
					if (initialNum % a != 0)
						doesNumDivide = false;
				}
			

			if (doesNumDivide==true)
				System.out.println("Yes");
			else
				System.out.println("No");

		} catch (Exception e) {
			System.out.println("Something went wrong");
		}

	}
}
