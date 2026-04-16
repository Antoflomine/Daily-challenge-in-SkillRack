import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String a=sc.nextLine();
		int c=0;
		for(int i=0; i<=s.length()-a.length(); i++) {
			if(s.substring(i,i+a.length()).equals(a)) {
				c++;
			}
		}
		System.out.println(c);

	}
}
