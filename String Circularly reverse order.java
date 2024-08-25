import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int n=sc.nextInt();
    String res="";
    StringBuilder f=new StringBuilder(s).reverse();
    String str=f.toString();
    StringBuilder sb=new StringBuilder();
   ArrayList<Character> arr=new ArrayList<>();
   for(char c:str.toCharArray()){
       arr.add(c);
   }
   int in=n-1;
   while(!arr.isEmpty()){
       in=in%arr.size();
       sb.append(arr.remove(in));
       in+=(n-1);
   }
System.out.println(sb.toString());
	}
}
