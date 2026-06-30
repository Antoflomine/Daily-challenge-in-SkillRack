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
	     int[] arr2 = Arrays.copyOf(arr, arr.length);
	     Arrays.sort(arr2);
	     for(int i=0;i<n;i++){
	         if(arr2[0]==arr[i]){
	             System.out.println(i);
	         }
	     }
	
	}
}
