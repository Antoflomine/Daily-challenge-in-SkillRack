import java.util.*;
public class Hello {

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
		int x=sc.nextInt();
		int y=sc.nextInt();
	//	System.out.println(x+" "+y);
		int[] rev=new int[c];
		int t=0;
		for(int j=c-1;j>=0;j--){
		    //System.out.println(arr[y-1][j]);
		    rev[t]=arr[y-1][j];
		    t++;
		}
		int[] res=new int[c];
		for(int j=0;j<c;j++){
		    res[j]=arr[x-1][j]*rev[j];
		}
		//System.out.println(Arrays.toString(res));
		for(int i=0;i<c;i++){
		    System.out.print(res[i]+" ");
		}
	}
}
