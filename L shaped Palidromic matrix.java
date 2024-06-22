import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char[][] arr=new char[n][n];
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        arr[i][j]=sc.next().charAt(0);
		    }
		}
		int y=0,p=n-1;
		for(int k=0;k<n;k++){
		String a="";
		for(int i=0;i<p;i++){
		    a+=arr[i][y];
		   
		}
		
		for(int j=y;j<n;j++){
		    a+=arr[p][j];
		   
		}
		
		y++;
		p--;
		 
		if(checkPali(a)==true)
		    System.out.println(a);
		   
		    
		}
		

	}
	public static boolean checkPali(String a){
	    StringBuilder sb=new StringBuilder(a).reverse();
	    String t=sb.toString();
	   // System.out.println(t);
	    if(t.equals(a)){
	        return true;
	    }
	    return false;
	}
}
