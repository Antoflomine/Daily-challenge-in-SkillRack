import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
		    arr[i] = sc.nextInt();
		}
		int flag = 0;
		for(int i=0; i<num; i++) {
		    if(arr[i] >= 100 && arr[i] <= 9999) {
		        System.out.println(arr[i]);
		        flag = 1;
		    }
		}
		if(flag == 0) {
		    System.out.println("-1");
		}
	}
}
