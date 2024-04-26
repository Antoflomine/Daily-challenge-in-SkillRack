import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		HashMap<Character,Integer> hp=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++){
		    if(hp.containsKey(str.charAt(i))){
		        hp.put(str.charAt(i),hp.get(str.charAt(i))+1);
		    }
		    else{
		        hp.put(str.charAt(i),1);
		    }
		}
		
		int max=0;
		for(Map.Entry<Character,Integer> it:hp.entrySet()){
		    if(max<it.getValue()){
		        max=it.getValue();
		    }
		}
		System.out.println(max);

	}
}
