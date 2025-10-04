package Strings;
import java.util.*;
public interface LengthEncoding {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder s = new StringBuilder(str);
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++){
            int count=1;
            char c = s.charAt(i);
            int j=i+1;
            while(j<s.length() && s.charAt(j)==c){
                count++;
                j++;
            }
            result.append(c);
            if(count>1) result.append(count);
            i=j-1;
        }
        System.out.println(result);

    }
}
