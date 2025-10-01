import java.util.*;
public class UniqueConcat{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        ArrayList<Character> l=new ArrayList<Character>();
        for(char c:c1){
            if(!l.contains(c)) l.add(c);
        }
        for(char c:c2){
            if(!l.contains(c)) l.add(c);
        }
        for(int i=0;i<l.size();i++){
            System.out.print(l.get(i));
        }
        
    }
}
