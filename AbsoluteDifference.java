import java.util.*;
public class AbsoluteDifference {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        Arrays.sort(arr);
        int diff = arr[n-1]-arr[0];
        System.out.print(diff);
    }
}
