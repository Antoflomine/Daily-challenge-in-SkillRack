import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    sc.nextLine();
	    String[] arr=new String[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextLine();
	    }
	    String y="";
	    for(int i=n-1;i>=0;i--){
	        y+=arr[i];
	     
	    }
		System.out.println(y);
	}
}
