import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    
	    if(n<=9){
	        System.out.println("-1");
	    }
	    else{
	        for(int i=10;i<=n;i++){
	            String str=String.valueOf(i);
	            int f=0;
	            for(int j=0;j<str.length()-1;j++){
	                if(str.charAt(j+1)-str.charAt(j)==1 ){
	                    f+=1;
	                }
	                else if(str.charAt(j)-str.charAt(j+1)==1){
	                    f+=1;
	                }
	               
	            }
	            
	            
	            
	        
	    
	    if(f==str.length()-1){
	        System.out.print(i+" ");
	    }
	            }
	        }
	    

	}
}
