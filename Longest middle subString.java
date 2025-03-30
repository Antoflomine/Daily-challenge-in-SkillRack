import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int a=s1.length()/2;
		int b=s2.length()/2;
		int sr=a+1;
		int sl=a-1;
		int rr=b+1;
		int rl=b-1;
		StringBuilder res=new StringBuilder();
		String ans="";
		
		if(s1.charAt(a)==s2.charAt(b)){
		    ans+=s1.charAt(a);
		    while(sl>=0 && rl>=0 &&(s1.charAt(sl)== s2.charAt(rl)) && (s1.charAt(sr)==s2.charAt(rr))){
		        res.append(s1.charAt(sl));
		        ans+=s1.charAt(sr);
		        
		        sl--;
		        rl--;
		        sr++;
		        rr++;
		        
		    }
		}
		if(ans.length()==0){
		    System.out.print("-1");
		}
		else{
		System.out.println(res.reverse()+""+ans);
		}
		
		

	}
}
