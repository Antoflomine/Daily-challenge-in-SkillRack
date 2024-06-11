import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		//HashMap<Integer,Integer> map=new HashMap<>();
		int[] brr=new int[n];
		
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		 }
	
		for(int i=0;i<n;i++){
		    int c=0;
            if(arr[i]%2==0){
                c+=3;
                
            }
            if(arr[i]%4==0 && arr[i]%6==0){
                c+=4;
            }
            double sqrt=Math.sqrt(arr[i]);
            if((sqrt-Math.floor(sqrt))==0){
                c+=5;
            }
		    brr[i]=c;
		    //System.out.println(c);
		    
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<n-1;j++){
		        if(brr[j]>brr[j+1]){
		            int t=brr[j];
		            int tp=arr[j];
		            brr[j]=brr[j+1];
		            arr[j]=arr[j+1];
		            brr[j+1]=t;
		            arr[j+1]=tp;
		        }
		    }
		}
for(int i=0;i<n;i++){
    System.out.println(arr[i]+" "+brr[i]);
}
	}
}
