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

int f=0;
  //  System.out.println(Arrays.toString(arr));
    for(int m=0;m<n-2;m++){
     for(int j=0;j<n-1;j++){    
    
	    long sum=0;
	    
	    sum+=((arr[m]*arr[m])+(arr[j]*arr[j]));
	  
	   //System.out.println(sum);
	   
	    for(int i=n-1;i>=0;i--){
	       // System.out.println("T:"+(arr[i]*arr[i]));
	    if(sum==(arr[i]*arr[i])){
	       f=1;
	        System.out.println("Yes");
	        
	        return;
	    }
	    
	    
	}
     }
	}
	if(f==0){
	    System.out.println("No");
	}


	}
}
