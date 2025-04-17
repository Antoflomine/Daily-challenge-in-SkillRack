import java.util.*;
// 3
//3
// 1 2 3 
// 4 5 6
// 7 8 9
//3

// 3 6 9
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] arr=new int[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		int k=sc.nextInt(); //k=3;
		for(int i=0;i<r;i++){
		    System.out.print(arr[i][k-1]+" ");
		}
	}
}
