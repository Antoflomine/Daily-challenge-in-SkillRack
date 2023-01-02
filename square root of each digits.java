import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++){
		    int N=Character.getNumericValue(str.charAt(i));
		    System.out.printf("%.2f ",Math.sqrt(N));
		    
		}

	}
}
