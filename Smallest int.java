import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    Arrays.sort(arr);
	    int res=1;
	    for(int i=0;i<n && arr[i]<=res;i++){
	        res+=arr[i];
	    }
	    System.out.println(res);

	}
}
