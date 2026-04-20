import java.util.*;


public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();

		int y=0;
		for(int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ) {
				y=i;
				break;
			}
		}
		String a=str.substring(0,y+1);
		StringBuilder sb=new StringBuilder(a).reverse();
		System.out.println(sb.toString()+""+str.substring(y+1));
	}
}
