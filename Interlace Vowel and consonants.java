import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    String v="",c="";
	  
	    for(int i=0;i<str.length();i++){
	        if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U'){
	            v+=str.charAt(i);
	        }
	        else{
	            c+=str.charAt(i);
	        }
	        
	    }
	    StringBuilder sb=new StringBuilder(c).reverse();
	    String con=sb.toString();
	   // System.out.println(con);
	    int y=v.length()<con.length()?v.length():con.length();
	    //System.out.println(y);
	  String l="";
        if(y<v.length()){
            l=v;
        }
        else{
            l=con;
        }
        
        for(int i=0;i<y;i++){
            System.out.print(v.charAt(i));
            System.out.print(con.charAt(i));
        }
        System.out.println(l.substring(y,l.length()));
	}
}
