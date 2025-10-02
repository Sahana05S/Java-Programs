package Strings;
import java.util.Scanner;
public class LongestPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String longest = "";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String subs = str.substring(i, j);
                if(isPalindrome(subs)) {
                    String palindrome = subs;
                    if(palindrome.length()>longest.length()) longest=palindrome;
                }
            }
        }
        System.out.println(longest);
    }
    private static boolean isPalindrome(String s){
        String reverse = new StringBuilder(s).reverse().toString();
        if(s.equals(reverse)) return true;
        else return false;
    }
}
