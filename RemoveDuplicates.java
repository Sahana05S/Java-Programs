import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        ArrayList<Character> seen = new ArrayList<>();

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(!seen.contains(c)){
                seen.add(c);
                result.append(c);
            }
            
        }

        System.out.println("Original: " + str);
        System.out.println("Without Duplicates: " + result);
        int x=5;
        System.out.print(x++ + x++);
    }
}