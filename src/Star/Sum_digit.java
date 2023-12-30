package Star;

import java.util.Scanner;

public class Sum_digit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in); 
	System.out.println("Enter a number");

	int num=sc.nextInt();
	
	int sum = calculateDigit(num);
	System.out.println(sum);
}

private static int calculateDigit(int n) {
	int sum = 0;
	while(n>0) {
		int digit =n%10;
		sum+= digit;
		n/=10;
	}
	return sum;
}
}
