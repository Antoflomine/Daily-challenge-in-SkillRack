import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String x=sc.next();
		String y=sc.next();
		System.out.println(x+" "+y);
		
		char max='0';
		for(int i=0;i<y.length();i++){
		    if(max<y.charAt(i)){
		        max=y.charAt(i);
		    }
		}
 		char maxi='0';
		for(int i=0;i<x.length();i++){
		    if(maxi<x.charAt(i)){
		        maxi=x.charAt(i);
		    }
		}
		String res="";
		for(int j=0;j<x.length();j++){
		    if(x.charAt(j)==maxi){
                res+=max;		        
		    }
		    else{
		        res+=x.charAt(j);
		    }
		}
		int sum=0;
		sum+=Integer.parseInt(res)+Integer.parseInt(y);
		System.out.println(sum);

	}
}
