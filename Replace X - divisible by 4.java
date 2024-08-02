import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(char i='0';i<='9';i++){
	    String res=str.substring(0,str.length()-1);
	        res+=i;
	        long y=Long.parseLong(res);
	        if(y%4==0){
	    System.out.print(res+" ");
	        }
		}

	}
}
