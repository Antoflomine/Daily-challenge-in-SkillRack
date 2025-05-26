import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String[] str=sc.nextLine().split(" ");
	    int[] arr=new int[str.length];
	    for(int i=0;i<str.length;i++){
	        arr[i]=Integer.parseInt(str[i]);
	    }
	    int n=sc.nextInt(); //5
	    for(int i=0;i<n;i++){
	        int q=sc.nextInt(); // 1 
	        int sr=sc.nextInt(); // 2
	        int er=sc.nextInt(); // 4
	        if(q==1){
	            int add=sc.nextInt(); //5
	            for(int j=sr-1;j<er;j++){
	               //arr.set(j,arr.get(j)+add);
	               arr[j] = arr[j]+add;
	            }
	             
	        }
	        else{
	            int sum=0;
	            for(int j=sr-1;j<er;j++){
	                sum+=arr[j];
	            }
	            System.out.println(sum);
	        }
	    
	    }
		//System.out.println(Arrays.toString(arr)); //  10 25 35 45 50
		// 20 35 35 45 50
	}
}
