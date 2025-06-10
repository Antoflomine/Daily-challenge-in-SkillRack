// 6
// 43 89 1 56 90 38
// 50
// 43 89 1 50 56 90 38

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long[] arr = new long[num];
		for(int i=0; i<num; i++) {
		    arr[i] = sc.nextLong();
		}
		int newNum = sc.nextInt();
		long[] resArr = new long[num+1];
		int k=0;
		for(int i=0; i<num+1; i++) {
		    if(i == num/2) {
		        resArr[i] = newNum;
		    }
		    else {
		        resArr[i] = arr[k++];
		    }
		}
		for(int i=0; i<num+1; i++) {
		    System.out.print(resArr[i] + " ");
		}
		System.out.println();
		for(int i=num; i>=0; i--) {
		    System.out.print(resArr[i] + " ");
		}
	}
}
