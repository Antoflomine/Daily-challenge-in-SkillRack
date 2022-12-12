import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int sum=0;
		sum+=100*(Character.getNumericValue(str.charAt(2)));
		sum+=10*(Character.getNumericValue(str.charAt(1)));
		sum+=Character.getNumericValue(str.charAt(0));
		System.out.print(sum);

	}
}
