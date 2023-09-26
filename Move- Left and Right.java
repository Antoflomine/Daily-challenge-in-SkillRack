import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int K=sc.nextInt();
		long sum=0;
		for(int i=0;i<K;i++){
		    if(i%2==0){
		    sum+=X;
		    }
		    else{
		    sum-=Y;
		    }
		}
		System.out.print(sum);
		

	}
}
