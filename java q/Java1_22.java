import java.util.Scanner;

//Implement a program to find the maximum of three numbers.
public class Java1_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("");
        int a = sc.nextInt();
        System.out.print("");
        int b = sc.nextInt();
        System.out.print("");
        int c = sc.nextInt();
        if (a >= b && a >= c) {
            System.out.printf("%d is the maximum: ", a);
        } else if (b >= c) {
            System.out.printf("%d is the maximum: ", b);

        } else {
            System.out.printf("%d is the maximum: ", c);
        }


        if (a == b && b == c) {
            System.out.println("All numbers are equal.");
        }

    }
}