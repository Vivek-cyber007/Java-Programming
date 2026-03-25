package Assigment_2;
import java.util.Scanner;
public class Max_in3 {
    int max;
    int a,b,c;
    Max_in3(int x, int y, int z)
    {
        a = x;
        b = y;
        c = z;
    }
    void check()
    {
  
        if(a>=b && a>=c)
        {
            max = a;
        }
        else if(b>=a && b>=c)
        {
            max = b;
        }
        else
        {
            max = c;
        }
        System.out.println("The maximum Number is "+ max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Enter Num1 : ");
        n1 = sc.nextInt();
        System.out.println("Enter Num1 : ");
        n2 = sc.nextInt();
        System.out.println("Enter Num1 : ");
        n3 = sc.nextInt();
        Max_in3 obj = new Max_in3(n1, n2, n3);
        obj.check();
    }

    
}
