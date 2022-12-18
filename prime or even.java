import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
	    if(N%2==0){
	        System.out.print("valid");
	        return;
	    }
	    int flag=0;
	    for(int i=2;i<N/2;i++){
	        if(N%i==0){
	            flag=1;
	        }
	    }
	    if(flag==0){
	        System.out.print("valid");
	    }
	    else{
	        System.out.print("invalid");
	    }

	}
}
