//Implement a program to find the smallest divisor of a number
import java.util.Scanner;

public class Java1_60 {
    public static int findSmallestDivisor(int num) {
        if (num < 2) {
            return num;
        }
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                return i;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its smallest divisor: ");
        int number = scanner.nextInt();
        System.out.println("Smallest divisor of " + number + " is: " + findSmallestDivisor(number));
    }
}
