import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		String a=Integer.toBinaryString(n);
		String b=Integer.toBinaryString(m);
		
		int y=a.length()<b.length()?a.length():b.length();
		String sb1=new StringBuilder(a).reverse().toString();
		String sb2=new StringBuilder(b).reverse().toString();
		String res="";
		for(int i=0;i<y;i++){
		    res+=sb1.charAt(i);
		    res+=sb2.charAt(i);
		}
		String bal="";
		if(a.length()>b.length()){
		    bal+=sb1.substring(y,sb1.length());
		    
		}
		else{
		    bal+=sb2.substring(y,sb2.length());
		}
		res+=bal;
		System.out.println(Integer.parseInt(res,2));
		//System.out.println(res);

	}
}
