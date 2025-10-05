package Strings;
import java.util.*;
public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int maxLen = 0;
        // String longestWord="";
        String[] sarr = str.split("\\s");
        ArrayList<String> longest = new ArrayList<>();

        for(String s:sarr){
            if(s.length()>maxLen) maxLen = s.length();
        }
        for(String s:sarr){
            if(s.length()==maxLen) longest.add(s);
        }
        for(int i=0;i<longest.size();i++) System.out.print(longest.get(i)+" ");
    }
}
