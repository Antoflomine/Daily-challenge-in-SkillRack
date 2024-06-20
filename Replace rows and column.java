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
		char ch=sc.next().charAt(0);

		    for(int i=0;i<r;i++){
		        for(int j=0;j<c;j++){
		            if(ch=='D' || ch=='d'){
		            arr[i][j]=arr[r-1][j];
		            }
		            else if(ch=='U' || ch=='u'){
		                arr[i][j]=arr[0][j];
		            }
		            else if(ch=='R' || ch=='r'){
		                arr[i][j]=arr[i][c-1];
		            }
		            else if(ch=='L' || ch=='l'){
		                arr[i][j]=arr[i][0];
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
