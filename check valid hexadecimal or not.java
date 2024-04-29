import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int f=0;
		
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i)>='0' && str.charAt(i)<='9'){
		        f++;
		    }
		    if((str.charAt(i)>='a' && str.charAt(i)<='f') || (str.charAt(i)>='A' && str.charAt(i)<='F')){
		        f++;
		    }
		   
		    
		}
		if(f==str.length()){
		    System.out.println("yes");
		}
		else{
		    System.out.println("no");
		}
	}
}
