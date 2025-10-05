package Looping;
import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0,count=0;
        int num=n;
        while(num!=0){
            int digit = num%10;
            count++;
            num=num/10;
        }
        num=n;
        while(num!=0){
            int digit=num%10;
            sum+= Math.pow(digit, count);
            num=num/10;
        }
        if(sum == n) System.out.print("Armstrong Number");
        else System.out.print("Not an Armstrong Number");
    }
}
