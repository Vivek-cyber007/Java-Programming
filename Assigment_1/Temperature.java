import java.util.Scanner;
public class Temperature 
{
    void convert(double x)
    {
    double f = (x * 9/5) +32;
    System.out.println("Temperture in Fahrenheit = "+f+" degree");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c;
        System.out.println("Enter Temperture in Celsius : ");
        c = sc.nextDouble();
        Temperature obj = new Temperature();
        obj.convert(c);
    }
    
}
