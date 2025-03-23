import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
	    int g=M*N;
		for(int i=0; i<g; i++) {
		    for(int j=0; j<g; j++) {
		        System.out.print(((i/M)+(j/M))%2+" ");
		    }
		    System.out.println();
		}
	}
}
