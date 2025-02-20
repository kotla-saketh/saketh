import java.util.Scanner;

//Create a program to take input for a person's name and age, then print a greeting.
public class Java1_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Name: ");
        String a=sc.nextLine();
        System.out.print("Age: ");
        int b=sc.nextInt();
        System.out.println("Hello " + a + "! You are " + b + " years old.");
        sc.close();



    }
}