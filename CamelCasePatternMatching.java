import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String[] ss1=s1.split("[A-Z]");
		String[] ss2=s2.split("[A-Z]");

		int c=0;
		if(ss1.length==ss2.length) {
			for(int i=1; i<ss2.length; i++) {
				if(ss1[i].contains(ss2[i])) {
					c++;
				}
			}
			System.out.println(c);
			if(c==ss1.length-1) {
				System.out.print("Yes");
			}
			else {
				System.out.println("No");
			}
		}
		else {
			System.out.println("No");

		}

	}
}
