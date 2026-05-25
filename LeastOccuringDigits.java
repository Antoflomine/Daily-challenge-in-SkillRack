import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    HashMap<Character,Integer> arr=new HashMap<>();
	    for(int i=0;i<str.length();i++){
	        if(arr.containsKey(str.charAt(i))){
	            arr.put(str.charAt(i),arr.get(str.charAt(i))+1);
	        }
	        else{
	            arr.put(str.charAt(i),1);
	        }
	    }
	    for(Map.Entry<Character,Integer> entry : map.entrySet()){
	        if(entry.getKey()==1){
	           System.out.print(entry.getValue()+" ");
	        }
	    }
// 		System.out.println(arr);
	}
}
