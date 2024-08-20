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
		int a=sc.nextInt();
		int b=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(a<x && b<y){
		for(int i=a-1;i<x;i++){
		    for(int j=b-1;j<y;j++){
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
		}
		else if(a>x && b<y){
		    for(int i=x-1;i<a;i++){
		        for(int j=b-1;j<y;j++){
		            System.out.print(arr[i][j]+" ");
		        }
		        System.out.println();
		    }
		}
		else if(a<x && b>y){
		    for(int i=a-1;i<x;i++){
		        for(int j=y-1;j<b;j++){
		            System.out.print(arr[i][j]+" ");
		        }
		        System.out.println();
		    }
		}
		else{
		    for(int i=x-1;i<a;i++){
		        for(int j=y-1;j<b;j++){
		            System.out.print(arr[i][j]+" ");
		        }
		        System.out.println();
		    }
		}
	//	System.out.println(y);

	}
}
