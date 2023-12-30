package Star;

public class CountWord {
	public static void main(String[] args) {
		String s1 = "Hi I am Rahul Sanjay Shermale";

		int count = countword(s1);
		System.out.println(count);
	}

	private static int countword(String s1) {
		int count = 0;
		if (s1.charAt(0) != ' ') {
			count++;
		}
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ' ' && s1.charAt(i + 1) != ' ') {
				count++;
			}
		}
		return count;
	}
}
