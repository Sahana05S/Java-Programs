import java.util.*;
public class FrequencyCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num: arr){
            if(freq.containsKey(num)) freq.put(num,freq.get(num)+1);
            else freq.put(num,1);
        }
        for(var i:freq.entrySet()) System.out.println(i.getKey()+" : "+i.getValue());
    }
}
