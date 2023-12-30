package Star;

import java.util.Arrays;

public class SortString {
	public static void main(String[] args) {
		String str = " rahul";
		
		char[] chaArray=str.toCharArray();
		Arrays.sort(chaArray);
		System.out.println(new String(chaArray));
	}
}
