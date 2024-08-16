import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int pre=-1;
		for(int i=0;i<n;i++){
		    String s=sc.next();
		   int elem=findMin(s,pre);
		 //  System.out.println(elem);
		 if(elem!=-1){
		     
		 
		    sum+=elem;
		    pre=elem;
		 }
		    //System.out.println(s);
		}
		System.out.println(sum);

	}
	public static int findMin(String s,int pre){
	    int min=Integer.MAX_VALUE;
	    
	    for(int i=0;i<s.length();i++){
	        int curEle=s.charAt(i)-'0';
	        if(curEle>=pre &&  min>curEle){
	            min=curEle;
	        }
	    }
	    if(min==Integer.MAX_VALUE){
	        return -1;
	    }
	    return min;
	}
}
