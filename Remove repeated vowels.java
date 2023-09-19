import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
	
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
		        
		    
		    int c=0;
		    for(int j=0;j<str.length();j++){
		        if(str.charAt(i)!=str.charAt(j) && i!=j){
		        c++;
		        }
		    }
		    if(c==str.length()-1){
		        System.out.print(str.charAt(i));
		    }
		    }
		    else{
		        System.out.print(str.charAt(i));
		    }
		    
		    
		}
		
		
		

	}
}
