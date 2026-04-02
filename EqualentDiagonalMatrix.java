import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		ArrayList<Integer> l=new ArrayList<>();
		ArrayList<Integer> r=new ArrayList<>();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==j) {
					l.add(arr[i][j]);
				}
				if((i+j)==(n-1)) {
					r.add(arr[i][j]);
				}
			}
		}
		Collections.sort(l);
		Collections.sort(r);

		int c=0;
		for(int i=0; i<l.size(); i++) {
			if(l.get(i)==r.get(i)) {
				c++;
			}
		}
		if(c==l.size()) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
