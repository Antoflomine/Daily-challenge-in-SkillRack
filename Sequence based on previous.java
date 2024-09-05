import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(n);
		while(n!=1){
		if(n%2!=0){
		    n=(n*3)+1;
		    arr.add(n);
		}
		else{
		    n=n/2;
		    arr.add(n);
		}
		}
		for(int c:arr){
		    System.out.print(c+" ");
		}
		//System.out.println(arr);
		

	}
}
