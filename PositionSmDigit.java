import java.util.*;


public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		int r=a.length()<b.length()?a.length():b.length();
		String sb=new StringBuilder(a).reverse().toString();
		String s=new StringBuilder(b).reverse().toString();


		for(int i=0; i<r; i++) {
			int sm=0;
			sm+=Character.getNumericValue(sb.charAt(i))+Character.getNumericValue(s.charAt(i));
			System.out.print(sm+" ");
		}
		if(a.length()>b.length()){
		    for(int i=r;i<a.length();i++){
		    System.out.print(sb.charAt(i)+" ");
		    }
		}else{
		   for(int i=r;i<b.length();i++){
		    System.out.print(s.charAt(i)+" ");
		    }
		}
	}
}
