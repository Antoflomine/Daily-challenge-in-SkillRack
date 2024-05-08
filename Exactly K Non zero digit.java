import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int K=sc.nextInt();
		int f=0;
		for(int i=X;i<=Y;i++){
		    String str=String.valueOf(i);
		    int c=0;
		    for(int j=0;j<str.length();j++){
		       
		        if(str.charAt(j)!='0'){
		            c++;
		        }
		    }
		   // System.out.println(c);
		    if(c==K){
		        System.out.print(i+" ");
		        f=1;
		        
		    }
		}
		if(f==0){
		    System.out.println("-1");
		}

	}
}
