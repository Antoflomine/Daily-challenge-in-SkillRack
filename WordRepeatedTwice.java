import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] arr=str.split(" ");
		HashMap<String,Integer> map=new LinkedHashMap<String,Integer>();
		for(String a:arr){
		    if(map.containsKey(a)){
		        map.put(a, map.get(a)+1);
		        
		        
		    }
		    else{
		        map.put(a,1);
		    }
		}
		int flag=0;
		for(Map.Entry entry: map.entrySet()){
		  //  System.out.println(entry.getKey()+"="+entry.getValue());
		  if((Integer)entry.getValue()==2){
		      System.out.println(entry.getKey());
		      flag=1;
		      return;
		  }
		 
		}
		if(flag==0){
		    System.out.println("-1");
		}
	//	System.out.println(Arrays.toString(arr));

	}
}
