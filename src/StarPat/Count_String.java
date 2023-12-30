package StarPat;

public class Count_String {
public static void main(String[] args) {
	String st="Rahul And Amar";
	String str=" ";
	int cnt=0;
	
	
	for(int i=0;i<st.length();i++){
		if(st.charAt(i)==' ') {
			str=str+cnt;
			cnt=0;
		}
		else {
			cnt++;
			str=str+st.charAt(i);
		}
	
	}
	str = str+cnt;
	System.out.println(str);
	System.out.println(st);
} 
}
