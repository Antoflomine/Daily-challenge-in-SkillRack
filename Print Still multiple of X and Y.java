import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
		    for(int j=arr[i];j>=1;j--){ // 29 28 27 26 25
		        if(j%x==0 || j%y==0){
		            System.out.println(j);
		            break;
		        }
		        else{
		            System.out.print(j+" ");
		        }
		    }
		}
	}
}
