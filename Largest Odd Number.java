import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int odd = -1;
		for(int i=str.length()-1; i>=0; i--) {
		    int a = Character.getNumericValue(str.charAt(i));
		    if(a%2 != 0) {
		        odd = i;
		        break;
		    }
		}
		if(odd == -1) {
		    System.out.println(0);
		}
		else {
		    System.out.println(str.substring(0, odd+1));
		}
	}
}
