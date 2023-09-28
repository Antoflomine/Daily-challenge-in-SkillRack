import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		//StringBuffer sb=new StringBuffer(s);
		int b=0;
		for(int i=0;i<s.length();i++){
		    StringBuffer sb=new StringBuffer(s);
		   String a=sb.deleteCharAt(i).toString();
		   for(int j=0;j<Integer.parseInt(a);j++){
		       System.out.print(s.charAt(i)+" ");
		   }
		   System.out.println();
		  
		}
		

	}
}
