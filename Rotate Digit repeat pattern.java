import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String N=sc.nextLine();
		
		for(int i=0;i<N.length();i++){
		    int y=Character.getNumericValue(N.charAt(i));
		    for(int j=0;j<y;j++){
		        System.out.print(y);
		    }
		    if(i!=N.length()-1){
		    System.out.print("-");
		    }
		}
	for(int i=1;i<N.length();i++){
	    rotate(N,i);
	}
        
	}
	
	public static void rotate(String str,int i){
	    int y=0;
	    String h=str.substring(i,str.length())+str.substring(y,i);
	    y++;
	    System.out.println();
	    for(int o=0;o<str.length();o++){
	        
	        for(int j=0;j<Character.getNumericValue(h.charAt(o));j++){
	            System.out.print(str.charAt(o));
	        }
	        if(o!=str.length()-1){
	        System.out.print("-");
	        }
	    }
	   // System.out.println(h);
	    if(h.equals(str)){
	        return;
	    }
	}
}
