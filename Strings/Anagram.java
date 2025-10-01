import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not anagrams");
            return;
        }
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        String s1=new String(c1);
        String s2 = new String(c2);
        if(s1.equals(s2)) System.out.println(str1 + " and " + str2 + " anagrams.");
        else System.out.println(str1 + " and " + str2 + " are not anagrams.");

    /*     if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }*/
    }
    /*private static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        int[] freq = new int[26];
        for(int i=0;i<str1.length();i++){
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            if(ch1>='a' && ch1<='z'){
                freq[ch1-'a']++;
            }
            if(ch2>='a' && ch2<='z'){
                freq[ch2-'a']--;
            }
        }
        int c=0;
        for(int count : freq){
            if(count == 0) c++;
            
        }
        if(c==26) return true;
        return false;

    }*/
}
