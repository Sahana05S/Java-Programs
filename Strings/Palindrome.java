import java.util.*;
public class Palindrome {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    sc.close();
    char[] c = s.toCharArray();
    int i=0,j=c.length-1;
    while(i<j){
        char temp = c[i];
        c[i]=c[j];
        c[j]=c[i];
        i++;j--;
    } 
    String reverse = new String(c);
    //if(s.equals(reverse)) System.out.print("Palindrome");
    //else System.out.print("Not a Palindrome");
    System.out.print(reverse);
    }
}
