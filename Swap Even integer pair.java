import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		    
		}
		ArrayList<Integer> eveIn=new ArrayList<>();
		ArrayList<Integer> eveN=new ArrayList<>();
		for(int i=0;i<n;i++){
		    if(arr[i]%2==0){
		        eveIn.add(i);
		        eveN.add(arr[i]);
		    }
		}
		int[] brr=arr.clone();
		//System.out.println(eveN);
		for(int i=0;i<eveN.size()-1;i=i+2){
		    int t=eveN.get(i);
		    eveN.set(i,eveN.get(i+1));
		    eveN.set(i+1,t);
		    
		}
		//System.out.println(eveN);
		for(int i=0;i<eveIn.size();i++){
		    brr[eveIn.get(i)]=eveN.get(i);
		}
		for(int i=0;i<brr.length;i++){
		    System.out.print(brr[i]+" ");
		}
	//	System.out.println(Arrays.toString(brr)+" *");
      
	}
}
