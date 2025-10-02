package Strings;
import java.util.*;
public class Pangram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] freq = new int[26];
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                freq[ch-'a']++;
            }
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0) count++;
        }
        if(count==26) System.out.println("Pangram");
        else System.out.println("Not a Pangram");

    }
}
