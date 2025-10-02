package Strings;
import java.util.HashSet;
import java.util.Scanner;

public class UniqueCheck {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<Character> seen = new HashSet<>();
        for(int i=0;i<str.length();i++){
            seen.add(str.charAt(i));
        }
        
        if(seen.size()==str.length()) System.out.print("true");
        else System.out.print("false");
    }
}
