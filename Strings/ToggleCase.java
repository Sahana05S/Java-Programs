package Strings;
import java.util.*;
public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder s = new StringBuilder(str);
        for(int i=0;i<str.length();i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                s.setCharAt(i,Character.toLowerCase(c));
            }
            else if(Character.isLowerCase(c)){
                s.setCharAt(i,Character.toUpperCase(c));
            }
        }
        System.out.println(s.toString());
    }
}
