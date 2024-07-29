import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		int y=0,x=n-1,q=0,b=0;
		int u=n%2==0?n/2:(n/2)+1;
		int max=0;
		while(u>0){
		int  sum=0;
		
		for(int i=0;i<n;i++){
		  //int sum=0;
		  
		    for(int j=0;j<n;j++){
		        if(i==y && j==y){
		            sum+=arr[i][j];
		        }
		        else if(i==y && j==x){
		            sum+=arr[i][j];
		        }
		        else if(i==x && j==y){
		            sum+=arr[i][j];
		        }
		        else if(i==x && j==x){
		            sum+=arr[i][j];
		        }
		        
		    }
		  //  x++;
		  //  y--;
		
		    
		}
		    //System.out.println(sum);
	if(sum>max){
	    max=sum;
	    q=y;
	    b=x;
	}
		    x--;
		    y++;
		u--;
		}
		//int[][] brr=new int[b][b];
		for(int i=q;i<=b;i++){
		    for(int j=q;j<=b;j++){
		        if(i==q || j==q || i==b || j==b){
		        System.out.print(arr[i][j]+" ");
		        }
		        else{
		            System.out.print("* ");
		        }
		    }
		    System.out.println();
		}
		//System.out.println(max+" "+q+" "+b);

	}
}
