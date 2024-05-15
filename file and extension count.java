import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] str=new String[n];
		sc.nextLine();
		Map<String,Integer> map=new LinkedHashMap<String,Integer>();

		for(int i=0;i<n;i++){
		    str[i]=sc.nextLine();
		    String[] arr=str[i].split("\\.");
		  System.out.println(Arrays.toString(arr));
		   if(map.containsKey(arr[arr.length-1])){
		       map.put(arr[arr.length-1],map.get(arr[arr.length-1])+1);
		   }
		   else{
		       map.put(arr[arr.length-1],1);
		   }
		    
		    
		}
		for(String a:map.keySet()){
		    System.out.println(map.get(a)+" ."+a);
		}
	//	System.out.println(map);

		
		

	}
}
