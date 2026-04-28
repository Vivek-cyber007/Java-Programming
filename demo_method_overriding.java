package Assigment_4;

class Parent {
    void read()
    {
        System.out.println("I am reading a book");
    }
}
class Child extends Parent
{
    @Override
    void read()
    {
        System.out.println("Named Harry Potter ");
    }
} 
public class demo_method_overriding{
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.read();
        Child obj2 = new Child();
        obj2.read();
    }
}