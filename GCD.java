import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		long c=a<b?a:b;
		
		long sum=1;
		for(int i=1;i<=c;i++){
		    sum*=i;
		}
		System.out.print(sum);

	}
}
