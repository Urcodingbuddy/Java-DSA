package ninth;

import java.util.Scanner;

public class TypeCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Word : ");
        char ch = s.next().trim().toLowerCase().charAt(0);
        System.out.println(ch);
        String word = "HELLO";
        System.out.println(word.trim().toLowerCase().charAt(0));

    }
}
