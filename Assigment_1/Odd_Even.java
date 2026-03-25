import java.util.Scanner;
public class Odd_Even {
    void check(int x)
    {
        if(x%2 == 0)
        { 
            System.out.println(x+" is Even");
        }
        else
        {
        System.out.println(x+" is Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  num;
        System.out.println("Enter Number to check : ");
        num = sc.nextInt();
        Odd_Even obj = new Odd_Even();
        obj.check(num);
    }
    
}
