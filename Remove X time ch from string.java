import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char a=sc.next().charAt(0);
		int n=sc.nextInt();
		
		String res="";
		int c=0;
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i)==a && c<n){
		        c++;
		    }
		    else{
		        res+=str.charAt(i);
		    }
		}
		if(res==""){
		    System.out.print("-1");
		}
		else{
System.out.print(res);
}
	}
}
