package Assigment_2;
import java.util.Scanner;
public class Leap_year {
    void calc(int year)
    {
        if(year%4 ==0)
        {
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any year : ");
        int a = sc.nextInt();
        Leap_year obj = new Leap_year();
        obj.calc(a);
    }
}
