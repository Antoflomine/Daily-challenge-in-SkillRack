import java.util.*;
public class Main {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int a=1,m=1;
		for(int i=0;i<n;i++){
		   
		    
		  
		    for(int j=0;j<m;j++){
		        sum+=a;
		     
		        a++;
		        
		    }
		    m++;
		    System.out.print(sum+" ");
		    sum=0;
		}

	}
}
