import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int X=sc.nextInt();
	    int Y=sc.nextInt();
	    
	    String a="";
	    int c=0;
	    for(int i=X+1;i<Y;i++){
	        a+=i;
	    }
	    char e=(char) (n + '0');;
	    for(int i=0;i<a.length();i++){
	        if(a.charAt(i)==e){
	            c++;
	        }
	    }
		System.out.println(c);
	}
}
