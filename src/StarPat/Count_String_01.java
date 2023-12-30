package StarPat;

public class Count_String_01 {
	public static void main(String[] args) {

		String s1 = "Rahul And Amar";

		String s2 = " ";
		int cnt=0;
		for (int i = 0; i <s1.length(); i++) {
			
			if (s1.charAt(i)==' ') {
				
				s2 = s2 + " " + cnt;
				cnt=0;
			} else {

				cnt++;
				s2 += s1.charAt(i);
			}

		}
		s2=s2+cnt;

		System.out.println(s2);

	}
}
