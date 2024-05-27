import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=Integer.toBinaryString(n);
	    //System.out.println(str);
	    int max=0;
		for(int i=0;i<str.length();i++){
		    String a=str.substring(i+1,str.length())+str.substring(0,i+1);
		    int y=Integer.parseInt(a,2);
		    if(y>max){
		        max=y;
		    }
		   // System.out.println(a);
		}
		System.out.println(max);

	}
}
