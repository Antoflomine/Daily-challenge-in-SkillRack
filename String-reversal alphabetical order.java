import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[] str=sc.nextLine().toCharArray();
		Arrays.sort(str);
		for(int i=str.length-1;i>=0;i--){
		    System.out.print(str[i]);
		}

	}
}
