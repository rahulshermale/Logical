package Star;

public class EvenOddStoreArrayTwo_Diff {
	public static void main(String[] args) {

		int arr[] = { 12, 52, 4, 3, 6, 4, 1, 9, 7, 8 };
		int evenarr = 0;
		int oddarr = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenarr++;
			} else {
				oddarr++;
			}

		}
		System.out.println(oddarr + "  " + evenarr);
		int evenarray[] = new int[evenarr];
		int oddarray[] = new int[oddarr];
		int evenindex = 0;
		int oddindex = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				evenarray[evenindex] = arr[i];
				evenindex++;

			} else {
				oddarray[oddindex] = arr[i];
				oddindex++;
			}
		}
		System.out.println(" ..................................");

		for (int i = 0; i < evenarray.length; i++) {
			System.out.println(evenarray[i]);
		}
		System.out.println("+++++++++++++++++++++++++++++++++ ");

		for(int od:evenarray) {
			System.out.println(od);
		}
		System.out.println(" ");
		for(int od:oddarray) {
			System.out.println(od);
		}
	}
}
