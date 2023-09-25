import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String res="";
		int a=1;
		for(int i=0;i<str.length();i=i+a){
		    res+=str.charAt(i);
		    a++;
		}
		System.out.print(res);
		

	}
}
