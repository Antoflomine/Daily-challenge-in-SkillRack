import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=sc.nextInt();
		String mid="";
		int a=(str.length()-n)/2;
		for(int i=0;i<a;i++){
		    System.out.print(str.charAt(i));
		}
		for(int i=str.length()-a-1;i>=a;i--){
		    System.out.print(str.charAt(i));
		}
		for(int i=str.length()-a;i<str.length();i++){
		    System.out.print(str.charAt(i));
		}

	}
}
