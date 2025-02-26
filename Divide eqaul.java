// The program must accept two integer values N and K as the input. The program must form a list of integers. The first value in the list is N. If N is divisible by K, then the integer value N/K must be added to the list for K times. Then the program must repeat the process for all the newly added integers in the list.
// Finally, the program must print the integer values in the list as the output.
// Boundary Condition(s):
// 2<＝N ＜=10^5
// 2＜＝K＜＝ 100
// Input Format:
// The first line contains Nand K separated by a space.
// Output Format:
// The first line contains the integer values in the list separated by a space.
// Example Input/Output 1:
// Input:
// 42
// Output:
// 4221111
// Explanation:
// Here N=4 and K=2
// Initially the list contains 4.
// N is divisible by K, so 2(4/2) is added to the list K times.
// The newly added values are 2 2 and divisible by K=2.
// Hence 2/2 = 1 is added K times for each 2. Hence 1 is added 4 times.
// The newly added values are 1 1 1 1 and they are not divisible by K=2.
// Hence we stop. Now the values in the list are 4 2 2 1 1 1 1 and printed as the output.
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
	    ArrayList<Integer> arr=new ArrayList<>();
	    arr.add(n);
	    int in=0;
	    while(in<arr.size()){
	        int c=arr.get(in);
	        if(c%k==0){
	            int v=c/k;
	            for(int i=0;i<k;i++){
	                arr.add(v);
	            }
	        }
	        in++;
	    }
	    for(int j:arr){
            System.out.print(j+" ");	
        }
}
	
}
