
    //Create a program to print a pyramid pattern using stars.

    import java.util.Scanner;

    public class Java1_62 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask the user for the number of rows
            System.out.print("Enter the number of rows for the pyramid: ");
            int rows = scanner.nextInt();

            // Outer loop for the rows
            for (int i = 1; i <= rows; i++) {
                // Inner loop to print spaces
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(" ");
                }
                // Inner loop to print stars
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                // Move to the next line after printing a row
                System.out.println();
            }
        }
    }

