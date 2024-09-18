import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[] arr=new int[m];
		for(int i=0;i<n;i++){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int k=sc.nextInt();
		    for(int j=x-1;j<y;j++){
		        arr[j]+=k;
		    }
		}
        //System.out.println(Arrays.toString(arr));
        for(int i=0;i<m;i++){
            System.out.print(arr[i]+" ");
        }
	}
}
