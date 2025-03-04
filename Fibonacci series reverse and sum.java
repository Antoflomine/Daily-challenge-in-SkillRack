import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long[] arr = new long[num];
		if(num == 1) {
		    System.out.print(0);
		    return;
		}
		if(num == 2) {
		    System.out.print(0 + " ");
		    System.out.print(1);
		    return;
		}
		long f = 0, s = 1;
		arr[0] = f;
		arr[1] = s;
		for(int i=2; i<num; i++) {
		    long sum = rev(f) + rev(s);
		    arr[i] = sum;
		    f = s;
		    s = sum;
		}
		for(int i=0; i<num; i++) {
		    System.out.print(arr[i] + " ");
		}
	}
	public static long rev(long n) {
	    long res = 0;
	    while(n != 0) {
	        long rem = n%10;
	        res = (res*10) + rem;
	        n /= 10;
	    }
	    return res;
	}
}
