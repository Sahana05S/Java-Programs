package Strings;
import java.util.*;
public class AlphabeticalOccurance {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str= str.replaceAll("[^a-z]", "").toLowerCase();
        char[] carr = str.toCharArray();
        Arrays.sort(carr);
        Map<Character,Integer> freq = new TreeMap<>();
        for(char i: carr){
            freq.put(i,freq.getOrDefault(i,0)+1);

        }
        for(var i:freq.entrySet()) System.out.println(i.getKey()+" : "+i.getValue());
    }
}
 