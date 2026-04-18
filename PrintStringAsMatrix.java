import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    int n=sc.nextInt();
	    
	    int st=0,en=n;
	    for(int i=0;i<s.length()/n;i++){
	        System.out.println(s.substring(st,en));
	        st=en;
	        en=en+n;
	    }
	    System.out.println(s.substring((en-n),s.length()));
	}
}
