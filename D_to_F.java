import java.util.Scanner;
public class D_to_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        str = str.replace("D","F");
        str = str.replace("d","f");
        System.out.println("After replace : "+str);
    }    
}
