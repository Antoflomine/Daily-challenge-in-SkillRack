import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		HashMap<Character,Integer> map=new LinkedHashMap<>();
		
		for(int i=0;i<str.length();i++){
		    if(map.containsKey(str.charAt(i))){
		        map.put(str.charAt(i),map.get(str.charAt(i))+1);
		    }
		    else{
		        map.put(str.charAt(i),1);
		    }
		}
//System.out.print(map);
for(Map.Entry<Character,Integer> e:map.entrySet()){
    if(e.getValue()==1){
        System.out.print(e.getKey()+" ");
        
    }
}
	}
}
