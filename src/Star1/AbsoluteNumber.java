package Star1;

import java.util.Scanner;

public class AbsoluteNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number : ");
		int num = sc.nextInt();

		if (num < 0) {
			num = num * (-1);
		}
		System.out.println(num);
	}
}
