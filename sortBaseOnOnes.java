import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		}
		int[] crr=arr.clone();
		
		for(int i=0;i<N-1;i++){
		    
		    
		    for(int j=i+1;j<N;j++){
		        int ca=0,cb=0;
		        String a=Integer.toBinaryString(crr[i]);
		        String b=Integer.toBinaryString(crr[j]);
		        for(int k=0;k<a.length();k++){
		            if(a.charAt(k)=='1'){
		                ca++;
		            }
		        }
		        for(int k=0;k<b.length();k++){
		            if(b.charAt(k)=='1'){
		                cb++;
		            }
		        }
		        
		       // System.out.println(ca+" "+cb);
		        if(ca<cb){
		            int t=crr[i];
		            crr[i]=crr[j];
		            crr[j]=t;
		        }
		        if(ca==cb){
		            if(crr[i]>crr[j]){
		                int t=crr[i];
		                crr[i]=crr[j];
		                crr[j]=t;
		            }
		        }
		    }
		}
		//System.out.println(Arrays.toString(crr));
		for(int i=0;i<N;i++){
		    System.out.print(crr+" ");
		}
		

	}
}
