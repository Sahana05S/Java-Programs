import java.util.*;
public class PalindromeNew {
    public static void main(String[] args){
        String s = "madam";
        
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            int ascii = (int) c;
            System.out.print(ascii + " ");
        }
        
    }
}
