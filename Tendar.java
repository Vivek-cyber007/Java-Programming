import java.util.Scanner;
class Tendar {
    String name;
    double cost;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tendar[] t = new Tendar[5];
        int min = 0;
        for(int i =0; i<5;i++)
        {
            t[i] = new Tendar();
            System.out.println("Enter Company Name and Cost : ");
            t[i].name = sc.next();
            t[i].cost = sc.nextDouble();
            if(t[i].cost < t[min].cost)
                min =i;  
        }
        System.out.println("Company with minimum cost : "+t[min].name);
    }
}
