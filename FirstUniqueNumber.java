import java.util.*;
public class FirstUniqueNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        int firstRepeat=0;
        for(int i=0;i<n;i++) arr[i]=sc.nextInt(); 
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
            if(map.containsKey(i)) map.put(i,map.get(i)+1);
            else map.put(i,1);
        }
        for(int i=0;i<n;i++){ 
            if(map.get(arr[i])==1){
                firstRepeat=arr[i]; 
                break;
            } 
        }
        System.out.print(firstRepeat);
    }
}
