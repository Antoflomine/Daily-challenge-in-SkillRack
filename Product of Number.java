import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==0){
		    System.out.println("0");
		    return;
		}
	    ArrayList<Integer> arr=new ArrayList<>();
	   long pro=1;
	   int c=0;
	   int num=2;
	   while(c<n){
	       if(isPrime(num)){
	           //System.out.println(num);
	           pro*=num;
	           c++;
	       }
	       num++;
	   }
	   System.out.println(pro);
	}
	public static boolean isPrime(int n){
	    if(n<=1){
	        return false;
	    }
	    for(int i=2;i*i<=n;i++){
	        if(n%i==0){
	            return false;
	        }
	    }
	    return true;
	}
}
