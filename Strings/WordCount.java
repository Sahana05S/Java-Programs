import java.util.*;
public class WordCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split("\\s+");
        HashMap<String,Integer> map = new HashMap<>();
        for(String s:arr){
           map.put(s,map.getOrDefault(s,0)+1);
        }
        for(var v:map.entrySet()){
            System.out.println(v.getKey()+":"+v.getValue());
        }
    }
    
}
