import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long s=sc.nextLong();
		
		//checkSort(s);
		System.out.println(checkSort(s));

	}
	public static long checkSort(long s){
	    String str=String.valueOf(s);
	    char[] arr=str.toCharArray();
	    char[] brr=arr.clone();
	    Arrays.sort(brr);
	    if(Arrays.equals(arr,brr)){
	        return s;
	    }
	    s--;
	    return checkSort(s);
	    
	    
	    //System.out.println(Arrays.toString(brr));
	}
}
