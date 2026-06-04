import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    char[][] arr=new char[n][n];
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            arr[i][j]=sc.next().charAt(0);
	        }
	    }
	    char[] f=new char[n*n];
	    char[] r=new char[n*n];
	    int k=0,l=0;
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            f[k++]=arr[i][j];
	        }
	    }
	      for(int i=n-1;i>=0;i--){
	        for(int j=n-1;j>=0;j--){
	            r[l++]=arr[i][j];
	        }
	    }
	    System.out.println(Arrays.toString(f));
	    System.out.println(Arrays.toString(r));
        int flag=0;
        for(int i=0;i<n*n;i++){
            if(f[i]==r[i]){
                System.out.print(f[i]+" ");
                flag=1;
            }
        }
        
        if(flag==0){
		System.out.println("-1");
        }
	}
}
