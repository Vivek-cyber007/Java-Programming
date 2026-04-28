package Assigment_4;

public class const_overloading {
    String name;
    int age;

    const_overloading() {
        name = "Unknown";
        age = 0;
    }

    const_overloading(String n) {
        name = n;
        age = 0;
    }

    const_overloading(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + " Age: " + age);
    }

    public static void main(String[] args) {
        const_overloading s1 = new const_overloading();
        const_overloading s2 = new const_overloading("Alex", 20);
        const_overloading s3 = new const_overloading("Jon Snow");

        s1.display();
        s2.display();
        s3.display();

    
    }
}
    

