import java.util.Scanner;

public class Java1_48 {
    //Implement a program to calculate the factorial of a number.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        int n= sc.nextInt();
        int m=1;
        for(int i=1;i<=n;i++){
            m*=i;
        }
        System.out.println(m);
        sc.close();


    }
}
