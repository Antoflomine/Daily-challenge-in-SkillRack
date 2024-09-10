import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    int x=0,y=0;
	    for(int i=0;i<str.length();i++){
	        if(str.charAt(i)=='u' || str.charAt(i)=='U'){
	            y++;
	        }
	        else if(str.charAt(i)=='R' || str.charAt(i)=='r'){
	            x++;
	        }
	        else if(str.charAt(i)=='d' || str.charAt(i)=='D'){
	            y--;
	        }
	        else{
	            x--;
	        }
	    
	    }
	    if(x==0 && y==0){
	        System.out.print("YES");
	    }
	    else{
	        System.out.print("NO");
	    }
	  //  System.out.println(x+" "+y);
	    

	}
}
