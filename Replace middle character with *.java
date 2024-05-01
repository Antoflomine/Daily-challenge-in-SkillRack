import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int len=str.length();
		String res="";
		int h=len/2;
		if(len%2!=0){
		   System.out.print(str.substring(0,h));
		   System.out.print("*");
		   System.out.print(str.substring(h+1,len));
		}
		else{
		    System.out.print(str.substring(0,h-1));
		    System.out.print("**");
		    System.out.print(str.substring(h+1,len));
		}

	}
}
