import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		if(str1.charAt(0)==str2.charAt(0) && str1.charAt(str1.length()-1)==str2.charAt(str2.length()-1)){
		    System.out.print("YES");
		}
		else{
		    System.out.print("NO");
		}
	}
}
