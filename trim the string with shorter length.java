import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
	    String[] arr=str.split(" ");
	    
		if(arr[0].length()<arr[1].length()){
		    System.out.println(arr[0]+" "+arr[1].substring(0,arr[0].length()));
		    
		}
		else if(arr[0].length()>arr[1].length()){
		    System.out.println(arr[0].substring(0,arr[1].length())+" "+arr[1]);
		}
		else{
		    System.out.println(str);
		}

	}
}
