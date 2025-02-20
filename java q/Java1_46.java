import java.util.Scanner;

public class Java1_46 {
    //Create a program to find the sum of all even numbers from 1 to N.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        int n= sc.nextInt();
        int sum=0;
        for(int i=2;i<=n;i+=2){
            sum+=i;
        }
        System.out.println(sum);
        sc.close();


    }
}
