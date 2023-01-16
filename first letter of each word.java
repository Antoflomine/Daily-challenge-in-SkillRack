import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] str=sc.nextLine().split(" ");
		for(int i=0;i<str.length;i++){
		    System.out.print(str[i].charAt(0));
		}

	}
}
