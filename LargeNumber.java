import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    if(a%10 > b%10){
	        System.out.println(a);
	    } 
	    else if(a%10 < b%10){
	        System.out.println(b);
	    }
	    else{
	        if(a>b){
	            System.out.println(a);
	        }else{
	            System.out.println(b);
	        }
	    }
	  

	}
}
