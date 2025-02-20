    //Create a program to find all prime numbers between two given numbers.
    import java.util.Scanner;

    public class Java1_54 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input the range
            System.out.print("Enter the start of the range: ");
            int start = sc.nextInt();
            System.out.print("Enter the end of the range: ");
            int end = sc.nextInt();

            // Validate range
            if (start > end) {
                System.out.println("Invalid range. Start must be less than or equal to end.");
            } else {
                System.out.println("Prime numbers between " + start + " and " + end + ":");

                // Find and print prime numbers in the range
                for (int num = start; num <= end; num++) {
                    if (isPrime(num)) {
                        System.out.print(num + " ");
                    }
                }
            }

            sc.close();
        }

        // Method to check if a number is prime
        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false; // Numbers less than or equal to 1 are not prime
            }
            for (int i = 2; i <= Math.sqrt(num); i++) { // Check divisors up to the square root
                if (num % i == 0) {
                    return false; // Number is divisible, not prime
                }
            }
            return true; // Number is prime
        }
    }


