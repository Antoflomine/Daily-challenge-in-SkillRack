import java.util.*;
public class Main {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		
		StringBuilder sb1=new StringBuilder(s1).reverse();
		StringBuilder sb2=new StringBuilder(s2).reverse();
		
		StringBuilder res=new StringBuilder();
		int y=sb1.length()<sb2.length()?sb1.length():sb2.length();
		for(int i=0;i<y;i++){
		    if(sb1.charAt(i)==sb2.charAt(i) && Character.getNumericValue(sb1.charAt(i))%2!=0){
		        res.append(sb1.charAt(i));
		    }
		}
		System.out.println(res.reverse().toString());

	}
}
