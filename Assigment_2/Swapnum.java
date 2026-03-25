package Assigment_2;
import java.util.Scanner;
public class Swapnum {
    int a,b;
    Swapnum(int x, int y)
    {
        a = x;
        b = y;
    }
    void swap()
    {
        System.out.println("Before Swap : "+a+" "+b);
        int temp;
        temp = a + b;
        a = temp - a;
        b = temp - a;
        System.out.println("After Swap : "+a+" "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st pair of Numbers ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        Swapnum obj1 = new Swapnum(n, m);
        obj1.swap();
        System.out.println("Enter 2st pair of Numbers ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        Swapnum obj2 = new Swapnum(p, q);
        obj2.swap();
    }
}
