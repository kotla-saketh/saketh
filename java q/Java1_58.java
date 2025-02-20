//Create a program to print the sum of all numbers divisible by 3 and 5 within a range.
import java.util.Scanner;

public class Java1_58 {
    public static int sumDivisibleBy3And5(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();
        System.out.println("Sum of numbers divisible by 3 and 5: " + sumDivisibleBy3And5(start, end));
    }
}
