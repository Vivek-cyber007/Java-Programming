import java.util.Scanner;

public class StringStat {
    String str;

    StringStat(String str) {
        this.str = str;
    }

    void Check() {
        int upper = 0, lower = 0, digits = 0, spaces = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch))
                upper++;
            else if (Character.isLowerCase(ch))
                lower++;
            else if (Character.isDigit(ch))
                digits++;
            else if (ch == ' ')
                spaces++;
        }

        System.out.println("\n--- String Statistics ---");
        System.out.println("String        : " + str);
        System.out.println("Uppercase     : " + upper);
        System.out.println("Lowercase     : " + lower);
        System.out.println("Digits        : " + digits);
        System.out.println("Spaces        : " + spaces);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringStat obj = new StringStat(input);
        obj.Check();

        sc.close();
    }
}
