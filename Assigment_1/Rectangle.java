import java.util.Scanner;
public class Rectangle {
    int length,width;
    Scanner sc = new Scanner(System.in);
    void takeinput()
    {
        System.out.println("Enter Length of Rectangle : ");
        length = sc.nextInt();
        System.out.println("Enter Width of Rectangle : ");
        width = sc.nextInt();
    }
    void cal_area()
    {
        int area = length * width;
        System.out.println("Area of Rectangle : "+area+" unit sq");
    }
    void cal_perimeter()
    {
        int perimeter = 2*(length + width);
        System.out.println("Perimeter of Rectangle : "+perimeter+" unit");
    }
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.takeinput();
        obj.cal_area();
        obj.cal_perimeter();
    }
    
}
