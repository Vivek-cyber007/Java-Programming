import java.util.Scanner;

public class Rev_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0)
                reversed.append(" ");
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < reversed.length(); i++) {
            char ch = reversed.charAt(i);
            if (Character.isUpperCase(ch))
                result.append(Character.toLowerCase(ch));
            else if (Character.isLowerCase(ch))
                result.append(Character.toUpperCase(ch));
            else
                result.append(ch);
        }

        System.out.println("\nOriginal String       : " + str);
        System.out.println("After Reversing Words : " + reversed);
        System.out.println("After Swapping Case   : " + result);

        sc.close();
    }
}
