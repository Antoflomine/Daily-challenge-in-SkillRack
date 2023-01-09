import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char a=sc.next().charAt(0);
		if(str.charAt(0)!=a)System.out.print(a);
		
		    System.out.print(str);
		
		if(str.charAt(str.length()-1)!=a)
		    System.out.print(a);
	
	}
}
