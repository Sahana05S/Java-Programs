import java.util.Scanner;
public class FreqCheckString
{
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String s = x.nextLine();
		int count = 0;
		s = s.replaceAll("//s","PH");
		char[] ch = s.toCharArray();
		boolean[] visited = new boolean[ch.length];
		for(int i = 0;i < ch.length;i++){
		    if(visited[i]){
		        continue;
		    }
		    count = 1;
		    for(int j = i+1;j < ch.length;j++){
		        if(ch[i]==ch[j]){
		            visited[j] = true;
		            count++;
		        }
		    }
		System.out.println(ch[i] +" :"+count);
	}}
}