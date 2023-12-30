package Star;
import java.util.Scanner;

public class FindHighestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int max = Integer.MAX_VALUE;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();
            
            if (number < max) {
                max = number;
            }
        }
        
        System.out.println("The highest number is: " + max);
    }
}
