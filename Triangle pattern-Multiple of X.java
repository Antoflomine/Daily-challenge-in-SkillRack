import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int X=sc.nextInt();
		int k=1;
		for(int i=1;i<=N;i++){
		    for(int j=1;j<=i;j++){
		        if(k%X==0){
		            System.out.print("* ");
		        }
		        else{
		        System.out.print(k+" ");
		        }
		        k++;
		    }
		    System.out.println();
		}

	}
}
