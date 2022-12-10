import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int sum=0;
		if(n%2!=0){
		    sum+=arr[n/2];
		    sum+=arr[(n/2)-1];
		    sum+=arr[(n/2)+1];
		}
		else{
		    sum+=arr[n/2];
		    sum+=arr[(n/2)-1];
		    sum+=arr[(n/2)-2];
		    sum+=arr[(n/2)+1];
		}
		System.out.print(sum);

	}
}
