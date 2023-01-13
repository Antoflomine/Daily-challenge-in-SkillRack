import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int y=sc.nextInt();
	for(int i=1;i<=x;i++){
	    if(x%i==0 && y%i==0){
	        System.out.print(i+" ");
	    }
	}
	

	}
}
