import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    String[] arr=new String[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.next();
	    }
	    for(int i=0;i<n;i++){
	        int a=Integer.parseInt(arr[i]);
	        int sum=a;
	        for(int j=0;j<n;j++){
	            if(i!=j){
	                for(char c:arr[j].toCharArray()){
	                    int b=Character.getNumericValue(c);
	                    if((a%2==0 && b%2==0)||(a%2!=0 && b%2!=0)){
	                        sum+=b;
	                    }
	                }
	            }
	        }
	        
	        System.out.print(sum+" ");
	    }
	    //System.out.println(Arrays.toString(arr));

	}
}
