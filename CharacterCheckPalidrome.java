import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    HashMap<Character,Integer> hm=new HashMap<>();
	    for(int i=0;i<s.length();i++){
	        if(hm.containsKey(s.charAt(i))){
	             hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
	        }
	        else{
	            hm.put(s.charAt(i),1);
	        }
	    }
	    int c=0,cc=0;
	    for(Map.Entry<Character, Integer> i:hm.entrySet()){
	        if(i.getValue()%2!=0){
	            c++;
	        }
	        else{
	            cc++;
	        }
	        
	    }
	    if(c==1 || cc>=1){
	        	System.out.println("Yes");
	    }
	    else{
	        System.out.println("No");
	    }
		System.out.println(hm);
	}
}
