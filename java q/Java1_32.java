
    //Create a program to check if a number is prime.
   import java.util.Scanner;
public class Java1_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check if the number is less than 2 (not prime)
        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
        } else {
            // Check if the number is divisible by any number from 2 to num-1
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Print result
            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }

        sc.close();
    }

}

