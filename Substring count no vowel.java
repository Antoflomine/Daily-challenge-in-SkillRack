import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    int n=str.length();
	    int c=0;
	    for(int i=0;i<n;i++){
	        for(int j=i+2;j<=n;j++){
	            String s=str.substring(i,j);
	            if(!vowel(s)){
	            c++;    
	            }
	            //System.out.println(s);
	        }
	        
	    }
	    System.out.println(c);
    }
    
	    
	    public static boolean vowel(String s){
	        boolean b=false;
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)=='A' || s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='E' || s.charAt(i)=='i' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='o' || s.charAt(i)=='U' || s.charAt(i)=='u'){
	               return true;
	            }
	        }
	        return false;
	    }
	    

	
}
