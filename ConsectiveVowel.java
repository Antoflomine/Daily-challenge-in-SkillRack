import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    ArrayList<String> arr=new ArrayList<>();
	    StringBuilder sb=new StringBuilder();
	    
	   
	    for(int i=0;i<str.length();i++){
	            if((str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o'|| str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')){
	                sb.append(str.charAt(i));
	            }
	            else{
	                if(sb.length()>0){
	                    arr.add(sb.toString());
	                    sb.setLength(0);
	                }
	            }
	   }
	   if(sb.length()>0){
	       arr.add(sb.toString());
	       
	   }
	   if(arr.size()==0){
	       System.out.println("-1");
	   }
	   
	   for(String i:arr){
	    System.out.println(i);
	    }
	
		
	}
}
