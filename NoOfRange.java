import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int r1=sc.nextInt();
	    int r2=sc.nextInt();

	  int[] arr=new int[n];
	    Set<Integer> s=new HashSet<>();
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	        for(int j=r1;j<=r2;j++){
	            if(arr[i]==j){
	            s.add(arr[i]);
	            }
	        }
	        
	    }
	    
	    
		System.out.println(s.size());
	}
}
