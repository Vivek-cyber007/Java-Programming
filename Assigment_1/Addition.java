import java.util.Scanner;
public class Addition 
{
    Scanner sc = new Scanner(System.in);
    int a,b;
    void takeinput()
    {
        System.out.println("Enter Num 1: ");
        a = sc.nextInt();
        System.out.println("Enter Num 2: ");
        b = sc.nextInt();
    }
    void add()
    {
        int sum = a + b;
        System.out.println("Sum = "+sum);
    }
    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.takeinput();
        obj.add();
    }
}
