import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int a=sc.nextInt();
		
		for(int i=0;i<str.length()-a;i++){
		    System.out.print(str.charAt(i));
		}
		for(int i=str.length()-1;i>=str.length()-a;i--){
		    System.out.print(str.charAt(i));
		}
	}
}
