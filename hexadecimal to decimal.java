import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s=str.toUpperCase();
		StringBuilder a=new StringBuilder(s).reverse();
		String d=a.toString();
		double sum=0;
		for(int i=0;i<d.length();i++){
		   if(d.charAt(i)>='0' && d.charAt(i)<='9'){
		       double f=Character.getNumericValue(d.charAt(i))*(Math.pow(16,i));
		       sum+=f;
		   }
		   else{
		       double h=(double)(d.charAt(i)-55);
		       sum+=(h*(Math.pow(16,i)));
		       System.out.println(sum);
		   }
		    
		}
System.out.println(sum);
	}
}
