import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	   int s = arr[0];
        int max = arr[0];
	    for(int i=1;i<n;i++){
	        if(arr[i]>arr[i-1]){
	            s+=arr[i];
	            
	            
	        }
	        else{
	            s=arr[i];
	        
	        }
	        if(s>max){
	            max=s;
	        }
	       // System.out.println(s);
	    }
	    	System.out.println(max);
	}

}
