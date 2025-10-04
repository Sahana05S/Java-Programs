package Strings;
import java.util.*;
public class LengthDecoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder s = new StringBuilder(str);
        StringBuilder result = new StringBuilder();
       for(int i=0;i<s.length();i++){
            int count=0;
            char c = s.charAt(i);
            int j=i+1;
            while(j<s.length() && s.charAt(j)>='0' && s.charAt(j)<='9'){
                count = count*10+(s.charAt(j)-'0');
                j++;
            }
            if(count == 0) count=1;
            for(int k=0;k<count;k++) result.append(c);
            i=j-1;
        }
        System.out.println(result);
    }
}
