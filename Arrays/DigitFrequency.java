package Arrays;
import java.util.*;
public class DigitFrequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int[] freq = new int[10];
        for(int i=0;i<10;i++){
            for(int j=0;j<n;j++){
                if(arr[j]==i) freq[i]++;
            }
        }
        System.out.print(Arrays.toString(freq));
    }
}
