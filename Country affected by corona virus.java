import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] arr=new String[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextLine();
		    
		}
		LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<n;i++){
		    String[] sp=arr[i].split(" ");
		    if(map.containsKey(sp[sp.length-1])){
		        map.put(sp[sp.length-1],map.get(sp[sp.length-1])+1);
		    }
		    else{
		        map.put(sp[sp.length-1],1);
		    }
		    
		}
// 		System.out.println(map);
		
// 		System.out.println(Arrays.toString(arr));

        
        //for(Map.Entry<String,Integer> e:map.entrySet()){
            
        LinkedList<Map.Entry<String,Integer>> list=new LinkedList<>(map.entrySet());
        list.sort(Map.Entry.<String,Integer>comparingByValue().reversed());
        for(Map.Entry<String,Integer> ele:list){
        System.out.println(ele.getKey()+" "+ele.getValue());
        }
        

	}
}
