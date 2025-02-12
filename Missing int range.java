// the program must accept N sorted (in ascending order) integers as the input. The program must print the missing range of values as the output. If none of the values are missing the program must print -1 as the output.
// Boundary Condition(s):
// 2 <＝N<=1004
// Input Format:
// The first line contains N
// The second line contains N integer values separated by a space.
// Output Format:
// The first line contains -1 or the missing range of values separated by a space.
// Example Input/Output 1:
// Input:
// 5
// 1256 12
// Output:
// 3-4 7-11
// Explanation:
// The missing values are 3,4. Hence the range is printed as 3-4
// The next missing values are 7,8,9,10,11. Hence the range is printed as 7-11.
// Example Input/Output 2:
// Input:
// 6
// 123567
// Output:
// 4-4  In Java
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int start=1;
	    ArrayList<String> li=new ArrayList<>();
	    for(int num:arr){
	        if(num>start){
	            if(num-1==start){
	                li.add(start+"-"+start);
	            }
	            else{
	                li.add(start+"-"+(num-1));
	            }
	        }
	        start=num+1;
	    }
	    if(li.size()==0){
	        System.out.println("-1");
	    }
	    else{
		for(String l:li){
		    System.out.print(l+" ");
		}
	    }

	}
}
