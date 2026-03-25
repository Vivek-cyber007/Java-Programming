package Assigment_3;

public class Nest {
    private String name = "Vivek Kumar Choudhary";
        class InnerNest{
            void display()
            {
                System.out.println(name);
            }
        }
    public static void main(String[] args) {
        Nest obj1 = new Nest();
        Nest.InnerNest obj2 = obj1. new InnerNest();
        obj2.display();
    }
}
