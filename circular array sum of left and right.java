import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	int[] arr=new int[n];
		
	
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
	
		    
 		for(int i=0;i<n;i++){
 		    int l=arr[i]%10,f=arr[i];
 		    while(f>9){
 		        f/=10;
 		    }
 		    int sum=0;
 		    for(int j=i-1;j>=i-f;j--){
 		        if(j<0){
 		            sum+=arr[n+j];
 		        }
 		        else{
 		        sum+=arr[j];
 		        }
 		    }
 		    for(int j=i+1;j<=i+l;j++){
 		        sum+=arr[j%n];
 		    }
 		    System.out.print(sum+" ");
 		}
}
		

	
}
