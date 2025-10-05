package Looping;
import java.util.*;
public class PrimeNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<2) System.out.println("Invalid: There are no prime numbers less than 1 -_-");
        for(int i=2;i<=n;i++){
            if(factorCount(i)==2) System.out.print(i+" ");
        }
    }
    private static int factorCount(int num){
        int fC = 0;
        for(int i=0;i<num;i++){
            if(num% (i+1) == 0) fC++;
        }
        return fC;
    }
}
