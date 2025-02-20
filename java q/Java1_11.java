//Create a program to print the cube of a given number.
import java.util.Scanner;

public class Java1_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int cube = num * num * num;
        System.out.println("The cube of " + num + " is " + cube);
        sc.close();
    }
}
