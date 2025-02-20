import java.util.Scanner;

public class Java1_43 {
    //Write a program to calculate the sum of numbers from 1 to N using a loop.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
        sc.close();
    }

}
