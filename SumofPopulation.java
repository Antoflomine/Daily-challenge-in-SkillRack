import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] arr=new String[n];
		int sum=0;
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextLine();
			String[] y=arr[i].split(" ");
			int h=Integer.parseInt(y[1]);
			sum+=h;
		}
		System.out.println(sum);
		for(int i=0; i<n; i++) {
			String[] y=arr[i].split(" ");
			System.out.println(y[0]+":"+y[1]);
		}
	}
}
