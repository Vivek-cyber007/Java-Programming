import java.util.Scanner;

class Point {
    double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void displayPoint() {
        System.out.println("Center Point: (" + x + ", " + y + ")");
    }
}

class Circle extends Point {
    double radius;

    Circle(double x, double y, double radius) {
        super(x, y); // calls Point constructor
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    void display() {
        displayPoint(); // from Point class
        System.out.println("Radius     : " + radius);
        System.out.printf("Area       : %.2f%n", area());
    }
}

public class Center {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter X coordinate of center: ");
        double x = sc.nextDouble();

        System.out.print("Enter Y coordinate of center: ");
        double y = sc.nextDouble();

        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();

        Circle c = new Circle(x, y, radius);
        c.display();
    }
}