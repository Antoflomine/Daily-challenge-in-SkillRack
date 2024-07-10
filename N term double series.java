import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		//System.out.println(x+" "+y);
		int i=1,c=0;
		while(c<n){
		    if(i%2!=0){
		    System.out.print((i*x)+1+" ");
		    c++;
		    if(c==n){
		        break;
		    }
		    System.out.print((i*y)+1+" ");
		    c++;
		    }
		    else{
		        System.out.print((i*x)-1+" ");
		        c++;
		        if(c==n){
		            break;
		        }
		        System.out.print((i*y)-1+" ");
		        c++;
		    }
		    i++;
		}

	}
}
