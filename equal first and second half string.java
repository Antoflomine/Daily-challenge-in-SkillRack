import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=str.length()/2;
// 		String b=str.substring(n+1,str.length());
// 		System.out.print(b);
		int a=str.length()%2==0?n:n+1;
		if((str.substring(0,n)).equals(str.substring(a,str.length()))){
		    System.out.print("yes");
		}
		else{
		    System.out.print("no");
		}

	}
}
