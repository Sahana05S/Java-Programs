package Looping;
import java.util.*;
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] factorCount = new int[n];
        for(int i=0;i<n;i++){
            if(n% (i+1) == 0) factorCount[i]++;
        }
        for(int i=0;i<n;i++){
            if(factorCount[i]>=1) System.out.print(i+1 +" ");
        }
    }
}
