import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.nextLine();
    
        String str=sc.nextLine();
        char[] crr=str.toCharArray();
        
        int t=arr[0];
        for(int i=0;i<n-1;i++){
            if(crr[i]=='+'){
               t+=arr[i+1];
            }
            if(crr[i]=='-'){
                t-=arr[i+1];
            }
            if(crr[i]=='*'){
                t*=arr[i+1];
            }
            if(crr[i]=='/'){
                t/=arr[i+1];
            }
        }
         System.out.println(t);
        // System.out.println(Arrays.toString(crr));
	}
}
