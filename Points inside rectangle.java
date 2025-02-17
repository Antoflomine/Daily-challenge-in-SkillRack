import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
	    int[] q=new int[n];
	    int[] e=new int[n];
		for(int i=0;i<n;i++){
		   q[i]=sc.nextInt();
		   e[i]=sc.nextInt();
		}
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x4=sc.nextInt();
		int y4=sc.nextInt();
		int x3=x1;
		int y3=y4;
		int x2=x4;
		int y2=y1;
		
	//	System.out.println(x4+" "+y4);
	    int c=0;
	   for(int i=0;i<n;i++){
	       int x=q[i];
	       int y=e[i];
	       if((x>=x1 && x<=x2) && (y>=y3 && y<=y1)){
	           c++;
	           //System.out.println(x+" "+y);
	       }
	   }
	    System.out.println(c);

	}
}
