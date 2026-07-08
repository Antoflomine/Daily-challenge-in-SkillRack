import java.util.*;


public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int w=sc.nextInt();
	    int N=sc.nextInt();
	    int[] a=new int[w];
	    for(int i=0;i<N;i++){
	        int x=sc.nextInt();
	        a[i%w]+=x;
	    }
	    
		System.out.println(Arrays.toString(a));
	}
}
