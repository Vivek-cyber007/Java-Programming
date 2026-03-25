package Assigment_3;
import java.util.Scanner;
public class Factorial_calc {
    int calc(int x)
    {
        int n = 1;
        for(int i = 1 ;i<=x; i++)
        {
            n = n*i;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        Factorial_calc obj = new Factorial_calc();
        obj.calc(num);
        System.out.println("Factorial = "+obj.calc(num));
    }

}
