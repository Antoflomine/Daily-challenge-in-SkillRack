import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int x=sc.nextInt();
	    int y=sc.nextInt();
	    //System.out.println(x);
	    int f=0;
	    for(int i=x;i<=y;i++){
	        String str=String.valueOf(i);
	        int c=0;
	        for(int j=0;j<str.length();j++){
	            if(str.charAt(j)!='0'){
	                c++;
	            }
	        }
	        
	        if(c<str.length()){
	            System.out.print(i+" ");
	            f=1;
	        }
	      
	    }
	    if(f==0){
	        System.out.println("-1");
	    }

	}
}
