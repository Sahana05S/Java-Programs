import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch)) {
            ch = Character.toLowerCase(ch);

            if ("aeiou".indexOf(ch) != -1) {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Not a letter");
        }
    }
}
