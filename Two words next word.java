import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String w1=sc.nextLine().trim();
	    String w2=sc.nextLine().trim();
	    String str=sc.nextLine().trim();
	    String[] arr=str.split(" ");
	    ArrayList<String> li=new ArrayList<>();
	    for(int i=0;i<arr.length-2;i++){
	        if(arr[i].equals(w1)){
	            if(arr[i+1].equals(w2)){
	                li.add(arr[i+2]);
	            }
	        }
	    }
	    if(li.size()!=0){
	        for(String a:li){
	            System.out.print(a+" ");
	        }
	    }
	    else{
	    System.out.println("-1");
	    }
	    

	}
}
