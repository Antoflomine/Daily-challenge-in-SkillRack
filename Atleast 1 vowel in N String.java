import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine();
		String[] arr=new String[N];
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextLine();
		}
		int f=0;
		
		
		for(int i=0;i<N;i++){
		    int c=0;
		    for(int j=0;j<arr[i].length();j++){
		        if(arr[i].charAt(j)=='a' || arr[i].charAt(j)=='e' || arr[i].charAt(j)=='i' || arr[i].charAt(j)=='o' ||arr[i].charAt(j)=='u' || arr[i].charAt(j)=='A' || arr[i].charAt(j)=='I' || arr[i].charAt(j)=='E' || arr[i].charAt(j)=='O' || arr[i].charAt(j)=='U'){
		            c++;
		        }
		    }
		    if(c<1){
		        f=1;
		    }
		   
		    //System.out.println(c);
		}
		if(f==1){
		    System.out.println("no");
		}
		else{
		    System.out.println("yes");
		}

	}
}
