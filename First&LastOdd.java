import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	        
	        int l=arr[i]%10;
	        
	        int f=arr[i];
	        while(f>=10){
	            f/=10;
	        }
	        if(l%2!=0 && f%2!=0){
	            System.out.println(arr[i]);
	        }
	    }
		System.out.println("Hello World");
	}
}
