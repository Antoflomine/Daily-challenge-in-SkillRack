import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String b=Integer.toBinaryString(n);
		//System.out.println(b);
		int c=0;
		for(int i=0;i<b.length();i++){
		    if(b.charAt(i)=='1'){
		        c++;
		    }
		}
		if(c==b.length()){
		    System.out.println(n);
		}
		else{
		String sb="";
		int y=0;
		for(int i=0;i<b.length();i++){
		    if(b.charAt(i)=='0'){
		        sb+='1';
		       
		       y=i;
		       break;
		    }
		    else{
		        sb+=b.charAt(i);
		    }
		   
		}
		sb+=b.substring(y+1,b.length());
		
		int res=Integer.parseInt(sb,2);
		System.out.println(res);
		}

	}
}
