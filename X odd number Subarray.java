import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int X=sc.nextInt();
		int[] arr=new int[N];
		
		int c=0;
		
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		}
		
	   for(int i=1;i<=N;i++){
	       for(int j=0;j<=N-i;j++){
	      int y=0;
	           for(int k=j;k<j+i;k++){
	               if(arr[k]%2!=0){
	                   y++;
	               }
	              
	           }
	     if(y==X){
	         c++;
	     }  
	       //System.out.println(y);
	       }
	   }
	   System.out.println(c);
	}
}
