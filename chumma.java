import java.util.*;
public class chumma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for(int i=0;i<str.length();i++){
            int count =0;
            int j=i+1;
            char c = str.charAt(i);
            while(j<str.length() && str.charAt(j)>='0' && str.charAt(i)<='9'){
                count = count*10+(c-'0');
                j++;
            }
            if(count == 0) count= 1;
            for(int k=0;k<count;k++) result.append(c);
        }
        System.out.println(result);

    }
}
