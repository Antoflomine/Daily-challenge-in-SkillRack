import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++){
		    int a=Character.getNumericValue(str.charAt(i));
		    String m=Integer.toBinaryString(a);
		    System.out.println(String.format("%4s",m).replace(' ','0'));
		}
	}
}
