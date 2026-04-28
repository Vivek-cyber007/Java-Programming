package Assigment_4;

public class Area_of_shapes {
    void area(int a)
    {
        int area = a*a;
        System.out.println("Area of square = "+area);
    }
    void area(int l , int b)
    {
        int area = l*b;
        System.out.println("Area of Rectangle = "+area);
    }
    void area(double r)
    {
        double pi = 3.1415;
        double area = pi*r*r;
        System.out.println("Area of Circle = "+area);
    }
    public static void main(String[] args) {
        Area_of_shapes obj = new Area_of_shapes();
        obj.area(34);
        obj.area(35 , 89);
        obj.area(6.9);
    }
    
}
