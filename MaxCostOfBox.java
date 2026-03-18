import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int max=0;
	    for(int i=0;i<n;i++){
	        int p=sc.nextInt();
	        int pl=sc.nextInt();
	        int e=sc.nextInt();
	        int sm=0;
	        sm+=(p*10)+(pl*5)+(e*3);
	        if(sm>max){
	            max=sm;
	        }
	    }
		System.out.println(max);
	}
}
