import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		ArrayList<String> arr=new ArrayList<>();
		for(int i=0;i<n;i++){
		    arr.add(sc.nextLine().trim());
		}
		ReduceMinLen(arr);
	}
	public static void ReduceMinLen(ArrayList<String> arr){
	    while(!arr.isEmpty()){
	        int min=Integer.MAX_VALUE;
	        for(int i=0;i<arr.size();i++){
	            if((arr.get(i)).length()<min){
	                min=arr.get(i).length();
	            }
	        }
	        for(String s:arr){
	            System.out.println(s.substring(0,min));
	        }
	        
	        ArrayList<String> updated=new ArrayList<>();
	        for(String s:arr){
	            if(s.length()>min){
	                updated.add(s.substring(min));
	            }
	        }
	        arr.clear();
	        arr.addAll(updated);
	        ReduceMinLen(arr);
	    }
	}
}
