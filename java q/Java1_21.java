//Write a program to find the maximum of two numbers using if-else.

import java.util.Scanner;

public class Java1_21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("");
        int a = sc.nextInt();
        System.out.print("");
        int b = sc.nextInt();
        if (a>b){
            System.out.println("A is maximum");
        }
        else if (a<b){
            System.out.println("B is maximum");
        }
        else {
            System.out.println("Both are equal");
        }
        sc.close();


    }
}