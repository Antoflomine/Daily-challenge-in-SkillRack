import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s1=sc.nextLine();
	    String s2=sc.nextLine();
	    int[] a=new int[26];
	    for(int i=0;i<s1.length();i++){
	        if(s1.charAt(i)>='A' && s1.charAt(i)<='Z'){
	            a[(s1.charAt(i)+0)-65]++;
	        }
	    }
	    
	    int[] b=new int[26];
	     for(int i=0;i<s2.length();i++){
	        if(s2.charAt(i)>='A' && s2.charAt(i)<='Z'){
	            b[(s2.charAt(i)+0)-65]++;
	        }
	    }
	    int c=0;
		for(int i=0;i<26;i++){
		    if(a[i]==b[i]){
		        c++;
		    }
		}
		if(c==26){
		    System.out.println("1");
		}
		else{
		    System.out.println("0");
		}
	}
}
