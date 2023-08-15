import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] arr=str.toCharArray();
		
		for(int i=0;i<str.length();i++){
		    if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' || arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U'){
		        System.out.print("*");
		    }
		    else if(Character.getNumericValue(arr[i])>=0 && Character.getNumericValue(arr[i])<=9){
		        System.out.print("*");
		    }
		    else{
		        System.out.print(arr[i]);
		    }
		}

	}
}
