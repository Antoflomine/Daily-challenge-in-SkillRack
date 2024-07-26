import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		
		int c=0,max=0;
		for(int i=0;i<str.length()-1;i++){
		    if(str.charAt(i)=='s'){
		        if(str.charAt(i+1)=='r'){
		            c+=2;
		            i++;
		        }
		    }
		    else {
		        if(max<c){
		            max=c;
		        }
		        c=0;
		    }
		}
		if(max<c){
		    max=c;
		}
		System.out.println(max);
		

	}
}
