import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[] str=sc.nextLine().toCharArray();
		int a=0,e=0,l=0,o=0,u=0;
		for(int i=0;i<str.length;i++){
		    if(str[i]=='a'){
		        a++;
		    }
		    if(str[i]=='e'){
		        e++;
		    }
		    if(str[i]=='i'){
		        l++;
		        
		    }
		    if(str[i]=='o'){
		        o++;
		    }
		    if(str[i]=='u'){
		        u++;
		    }
		}
		System.out.printf("a "+a+"\ne "+e+"\ni "+l+"\n o "+o+"\nu "+u);

	}
}
