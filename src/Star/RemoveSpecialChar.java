package Star;

public class RemoveSpecialChar {
public static void main(String[] args) {
	String str="$R #A&H!       @U   () L";
	
//	System.out.println(str.split(""));
	System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
	System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
}
}
