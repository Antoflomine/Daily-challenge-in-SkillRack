import java.util.*;
public class Hello {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int y=sc.nextInt();
	int[] arr=new int[x];
	int[] brr=new int[y];
    for(int i=0;i<x;i++){
        arr[i]=sc.nextInt();
        
    }
    for(int j=0;j<y;j++){
        brr[j]=sc.nextInt();
        
    }
    for(int j=0;j<x;j++){
        for(int i=0;i<y;i++){
        if(arr[j]==brr[i]){
            System.out.print(arr[j]+" ");
        }
        }
    }
	}
}
