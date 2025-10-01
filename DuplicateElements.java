import java.util.*;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        for(int i:arr){
            if(!(seen.contains(i))) seen.add(i);
            else duplicate.add(i);
        }
        for(int i:duplicate) System.out.print(i+" ");
    }
}
