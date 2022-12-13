import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=sc.nextInt();
		char a=(char)n+96;
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i)==a){
		        System.out.print("yes");
		        return;
		    }
		}
		System.out.print("no");
		

	}
}
