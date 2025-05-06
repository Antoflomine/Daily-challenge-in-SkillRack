import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        int length = Math.max(dx, dy);
        int breadth = Math.min(dx, dy);
        System.out.println(length*breadth);
	}
}
