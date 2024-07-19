import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<int[]> arr=new ArrayList<>();
		ArrayList<Integer> li=new ArrayList<>();
		for(int i=0;i<n;i++){
		    int[] brr=new int[3];
		    
		   brr[0]=sc.nextInt();
		   brr[1]=sc.nextInt();
		   //li.add(brr[0]*brr[1]);
		  brr[2]=brr[0]*brr[1];
		  
		 // System.out.println(Arrays.toString(brr));
		    arr.add(brr);
		    
		    
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<n-1;j++){
		        if(arr.get(j)[arr.get(j).length-1]==arr.get(j+1)[arr.get(j+1).length-1]){
		            if(arr.get(j)[0]>arr.get(j+1)[0]){
		                int[] t=arr.get(j);
		                arr.set(j,arr.get(j+1));
		                arr.set(j+1,t);
		            }
		        }
		       if(arr.get(j)[arr.get(j).length-1]>arr.get(j+1)[arr.get(j+1).length-1]){
		           int[] t=arr.get(j);
		           arr.set(j,arr.get(j+1));
		           arr.set(j+1,t);
		       }
		       
		    }
		}
	   for(int[] g:arr){
	       for(int i=0;i<g.length;i++){
	           System.out.print(g[i]+" ");
	       }
	       System.out.println();
	   }

	}
}
