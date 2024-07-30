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
		for(int i=0;i<r;i++){
		    for(int j=0;j<r-1;j++){
		    int[] brr=arr[j];
		    int[] crr=arr[j+1];
		    if(brr[brr.length-1]>crr[crr.length-1]){
		        int[] t=arr[j];
		        arr[j]=arr[j+1];
		        arr[j+1]=t;
		    }
		    }
		}
		
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
		 

	}
}
