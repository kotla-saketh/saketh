//Write a program to find the remainder when one number is divided by another.
import java.util.Scanner;

public class Java1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();
        int remainder = dividend % divisor;
        System.out.println("The remainder is: " + remainder);
        sc.close();
    }
}
