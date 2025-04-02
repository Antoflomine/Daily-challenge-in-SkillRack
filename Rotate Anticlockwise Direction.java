import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char[][] arr=new char[n][n];
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        arr[i][j]=sc.next().charAt(0);
		    }
		}
		int l=0,h=n-1;
		int lay=n%2==0?n/2:(n/2)+1;
		while(lay>0){
		                char t=arr[l][l];
		                arr[l][l]=arr[l][h];
		                arr[l][h]=arr[h][h];
		                arr[h][h]=arr[h][l];
		                arr[h][l]=t;
		                
		                lay--;
		                l++;
		                h--;
		
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
	//	System.out.println(Arrays.deepToString(arr));

	}
}
