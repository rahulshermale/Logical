package Star;

import java.util.Scanner;

public class RevString {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		
		
		
		
		
		
		
		String str = "Rahul";

		int leng = str.length();
//	System.out.println(leng);

		char[] chArr = str.toCharArray();

		for (int i = chArr.length - 1; i >= 0; i--) {
			System.out.print(chArr[i]);
		}

		System.out.println("\n\n****************************************************\n");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		System.out.println("\n\n********************************************************\n");

		
		System.out.println("ENter String");
		String name=sc.nextLine();
		String rev = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			rev += name.charAt(i);

		}

		System.out.println("String is Reverse :" + rev);

	}
}