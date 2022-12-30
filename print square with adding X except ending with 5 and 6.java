import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int X=sc.nextInt();
		ArrayList<Long> arr=new ArrayList<Long>();
		for(int i=0;i<N;i++){
		    long m=sc.nextInt();
		    long sum=0;
		    sum+=(m*m)+X;
		    if(sum%10!=5 && sum%10!=6){
		        arr.add(sum);
		    }
		}
		if(arr.size()==0){
		    System.out.print("-1");
		}
		else{
		    
		  for(long i:arr){
		      System.out.print(i+" ");
		  }
		}

	}
}
