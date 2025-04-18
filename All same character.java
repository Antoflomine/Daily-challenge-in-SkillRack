import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char r=str.charAt(0);
		int c=0;
		for(int i=0;i<str.length();i++){
		    if(r==str.charAt(i)){
		        c++;
		    }
		}
		if(c==str.length()){
		System.out.print("YES");
		}
		else{
		    System.out.print("NO");
		}

	}
}
