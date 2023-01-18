import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int sum=0,c=0;
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		    if(i==0 || i==n-1){
		       sum+=arr[i];
		    }
		}
		for(int i=0;i<n;i++){
		    if(arr[i]==sum){
		        c++;
		    }
		}
		System.out.print(c);

	}
}
