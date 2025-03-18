import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] arr=new int[r][c];
		int[][] brr=new int[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        brr[i][j]=sc.nextInt();
		    }
		}
		int[][] n=new int[r][c];
		int u=0;
		for(int i=0;i<r;i++){
		    for(int j=c-1;j>=0;j--){
		        n[i][u++]=brr[i][j];
		    }
		    if(u==c){
		        u=0;
		    }
		}
		int[][] res=new int[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        res[i][j]=arr[i][j]+n[i][j];
		    }
		}
	    for(int i=0;i<r;i++){
	        for(int j=0;j<c;j++){
	            System.out.print(res[i][j]+" ");
	        }
	        System.out.println();
	    }

	}
}
