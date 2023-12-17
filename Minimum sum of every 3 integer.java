import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
	
	
	int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i=i+3){ 
		    int sum=0; //145
		   sum+=arr[i]+arr[i+1]+arr[i+2]; // 45 10 90
		   //System.out.println(sum); //145
		   if(min>sum){ // 145 >76
		       min=sum;
		   }
		}
		System.out.println(min);
		
	
		

	}
}
