import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int m=sc.nextInt();
	    int[] arr=new int[m];
	    for(int i=0;i<m;i++){
	        arr[i]=sc.nextInt();
	    }
	    int n=sc.nextInt();
	    int[] brr=new int[n];
	    for(int i=0;i<n;i++){
	        brr[i]=sc.nextInt();
	    }
	    int[] res=new int[m+n];
	    int k=0,u=0;
	    for(int i=0;i<m;i++){
	        if(arr[i]%2==0){
	            res[k++]=arr[i];
	            res[k++]=brr[u++];
	        }
	        else{
	            res[k++]=arr[i];
	        }
	    }
		System.out.println(Arrays.toString(res));
	}
}
