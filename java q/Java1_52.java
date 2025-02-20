    //Implement a program to find the greatest common divisor (GCD) of two numbers.
    import java.util.Scanner;

    public class Java1_52 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();

            int gcd = findGCD(num1, num2); // Call the GCD function

            System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);

            sc.close();
        }

        // Method to calculate GCD using the Euclidean algorithm
        public static int findGCD(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
    }


