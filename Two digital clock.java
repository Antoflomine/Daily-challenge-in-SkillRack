import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String c1=sc.nextLine();
	    String c2=sc.nextLine();
	    String T=sc.nextLine();
	    String[] a=c1.split(":");
	    String[] b=c2.split(":");
	    String[] t=T.split(":");
	    int y=Integer.parseInt(t[0]);
	    int x=Integer.parseInt(t[1]);
	    
	    int h1=Integer.parseInt(a[0]);
	    int h2=Integer.parseInt(b[0]);
	    int m1=Integer.parseInt(a[1]);
	    int m2=Integer.parseInt(b[1]);
	    
	    int dh=h2-h1;
	    int dm=m2-m1;
	    if(dm<0){
	        dm+=60;
	        dh-=1;
	    }
	    
	    y+=dh;
	    x+=dm;
	    
	    if(x>=60){
	        y+=x/60;
	        x=x%60;
	    }
	    if(y>=24){
	        y=y%24;
	        
	    }
	   
	   System.out.printf("%02d:%02d\n",y,x);
	        
	 

	}
}
