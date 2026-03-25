package Assigment_2;
import java.util.Scanner;
public class NumCheck {
    int num;
    NumCheck(int n)
    {
        num = n;
    }
    void check()
    {
        if(num < 0)
        {
            System.out.println("The Number is Negative\n");
        }
        else if(num > 0)
        {
            System.out.println("The Number is Positive\n");
        }
        else
        {
            System.out.println("Number is Zero\n");    
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number for checking : ");
        int x = sc.nextInt();
        NumCheck obj = new NumCheck(x);
        obj.check();
    }
}
