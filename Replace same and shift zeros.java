import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] brr=str.split(" ");
		int[] arr=new int[brr.length];
	    for(int i=0;i<brr.length;i++){
	        int y=Integer.parseInt(brr[i]);
	        arr[i]=y;
	    }
	    int n=arr.length;
		for(int i=0;i<n-1;i++){
		    if(arr[i]==arr[i+1]){
		        arr[i]=arr[i]*2;
		        arr[i+1]=0;
		        
		    }
		}
		int c=0;
		for(int i=0;i<n;i++){
		    if(arr[i]==0){
		        c++;
		    }
		    else{
		        System.out.print(arr[i]+" ");
		    }
		}
		for(int i=0;i<c;i++){
		    System.out.print("0 ");
		}
		//System.out.print(Arrays.toString(arr));

	}
}
