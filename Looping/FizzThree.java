package Looping;
import java.util.*;;
public class FizzThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<n+1;i++){
            if(String.valueOf(i).contains("3")) continue;
            if(i%3 == 0) System.out.print("Fizz ");
            else System.out.print(i+" ");
          
        }
    }
}
