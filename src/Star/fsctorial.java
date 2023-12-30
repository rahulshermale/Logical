package Star;

import java.util.Scanner;

public class fsctorial {
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	
	double num=sc.nextDouble();
	double sum=1;
	for (int i=1;i<=num;i++) {
		
		sum *=i;
	}
	
	System.out.println(sum);
}
}
