import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    int f=0;
	    int index=str.indexOf('X');
	    char a=index!=0?'0':'1';
	    for(char i=a;i<='9';i++){
	       String h=str.replace('X',i);
	       if(Integer.parseInt(h)%8==0){
	           System.out.println(i);
	           f=1;
	           return;
	       }
	       
	    }
	    if(f==0){
	        System.out.println("-1");
	    }

	}
}
