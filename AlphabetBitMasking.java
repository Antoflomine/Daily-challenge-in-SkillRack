import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    Set<Character> set=new HashSet<>();
		for(int i=0;i<str.length();i++){
		    set.add(str.charAt(i));
		}
		//System.out.println(set);
		ArrayList<Character> as=new ArrayList<>(set);
		
		int[] arr=new int[26];//a-0 b-1 c-2 ...z-25 a-97 
		for(int i=0;i<set.size();i++){
		    arr[((int)(as.get(i)))-97]++;
		}
		String res="";
		for(int i=25;i>=0;i--){
		    res+=arr[i];
		}
		System.out.println(Integer.parseInt(res,2));
		
	}
}
