import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    sc.nextLine();
	    String[] arr=new String[n];
	    
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextLine();
	    }
	   int[] c=new int[n];

	    for(int i=0;i<n;i++){
	        int cc=0;
	        for(int j=0;j<arr[i].length();j++){
	            if(arr[i].charAt(j)=='a' || arr[i].charAt(j)=='e' || arr[i].charAt(j)=='i' || arr[i].charAt(j)=='o' || arr[i].charAt(j)=='u' || arr[i].charAt(j)=='A' || arr[i].charAt(j)=='I' || arr[i].charAt(j)=='O' || arr[i].charAt(j)=='U'){
	                cc++;
	            }
	        }
	        c[i]=cc;
	        
	    }
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n-1;j++){
	        if(c[j]<c[j+1]){
	            int t=c[j];
	            String tt=arr[j];
	            c[j]=c[j+1];
	            arr[j]=arr[j+1];
	            c[j+1]=t;
	            arr[j+1]=tt;
	        }
	        }
	    }
// 		System.out.println(Arrays.toString(c));
// 			System.out.println(Arrays.toString(arr));
			System.out.println(arr[0]);
	}
}
