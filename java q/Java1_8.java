import java.util.Scanner;

//Write a program to convert temperature from Celsius to Fahrenheit.
public class Java1_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter:");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.print(fahrenheit);
        sc.close();

    }
}