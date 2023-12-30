package Star;

public class maxArray {
	public static void main(String[] args) {
		int arr[] = { 2, 1, 55, 8, 57, 9, 6, 1 ,10,0};
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
			
			int temp = arr[i];
			arr[i] = max;
			max = temp;
		}}
		System.out.println(max);
	}
}
