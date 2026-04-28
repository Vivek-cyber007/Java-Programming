package Assigment_4;

public class Demo_method_overloading {
    void check(int a)
    {
        System.out.println("I am an integer data type");
    }
    void check(double b)
    {
        System.out.println("I am a double data type");
    }
    public static void main(String[] args) {
        Demo_method_overloading obj = new Demo_method_overloading();
        obj.check(45);
        obj.check(69.9);
    }
    
}
