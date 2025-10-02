package Looping;
import java.util.*;
public class AbsSumAndCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0,sum=0;
        if(n<0) n = n*(-1);
        if(n == 0){
            count=1;
            sum=0;
        }
        while(n!=0){
            int temp=n%10;
            count++;
            sum+=temp;
            n=n/10;
        }
        System.out.print(count+" "+sum);
    }
}
