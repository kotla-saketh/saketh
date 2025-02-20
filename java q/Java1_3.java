import java.util.Scanner;

//Write a program to calculate the sum, difference, product, and quotient of two numbers.
public class Java1_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println();
        int b=sc.nextInt();
        System.out.println();
        int c=a+b;
        int d=a-b;
        int e=a*b;
        int f=a/b;
        int g=a%b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

    }
}