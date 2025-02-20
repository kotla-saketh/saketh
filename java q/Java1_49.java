import java.util.Scanner;

public class Java1_49 {
    //Write a program to count the number of digits in a number.
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            int count = 0;
            while (number != 0) {
                number /= 10;
                count++;
            }
            if (count == 0) {
                count = 1;
            }
            System.out.println("The number of digits is: " + count);
            sc.close();
        }
}
