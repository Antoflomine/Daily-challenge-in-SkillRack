import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int f=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]%2==arr[i+1]%2){
                System.out.println("no");
                f=1;
                return;
            }
        }
    if(f==0){
        System.out.println("yes");
    }
	}
}