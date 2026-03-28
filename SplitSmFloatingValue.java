import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    double[] arr=new double[n];
	    int s1=0,s2=0;
	    for(int i=0;i<n;i++){
	    double  f=sc.nextDouble();
	    int y=(int)f;
	    double r=f-y;
	   // System.out.println(r);
	    if(r<=.5){
	        s1+=y;
	    }
	    else{
	        s2+=y;
	    }
	    
	    }
	    
		System.out.println(s2+" "+s1);
	}
}
