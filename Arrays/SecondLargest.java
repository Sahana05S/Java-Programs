package Arrays;
import java.util.*;
public class SecondLargest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        if(n<2){
            System.out.print("No second largest.");
            return;
        }
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!list.contains(arr[i])) list.add(arr[i]);
        }
        if(list.size()<2) {
            System.out.print("No second largest.");
            return;
        }
        System.out.print(list.get(list.size()-2));

    }
}
