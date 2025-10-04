package Strings;
import java.util.*;
public record FirstLetterToggle() {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] sarr = str.split("\\s+");
        for(int i=0;i<sarr.length;i++){
            String word = sarr[i];
            char c = word.charAt(0);
            if(Character.isUpperCase(c)){
                word = Character.toLowerCase(c)+word.substring(1);
            }
            sarr[i]=word;
        }
        StringBuilder result = new StringBuilder();
        for(String s:sarr){
            result.append(s);
            result.append(" ");
        }
        System.out.print(result);
       
    }
}
