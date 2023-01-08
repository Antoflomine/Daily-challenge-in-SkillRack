import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++){
		    if(arr[i]==x){
		        sum++;
		    }
		}
		if(sum==x){
		    System.out.print("YES");
		}
		else{
		    System.out.print("NO");
		}
	}
}
