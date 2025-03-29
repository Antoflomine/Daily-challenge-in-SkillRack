import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int rank=sc.nextInt();
		Set<Integer> re =new TreeSet<>();
		for(int i=0;i<n;i++){
		    re.add(arr[i]);
		}
		ArrayList<Integer> res=new ArrayList<>(re);
		for(int i=0;i<res.size();i++){
		    for(int j=0;j<res.size()-1;j++){
		        if(res.get(j)<res.get(j+1)){
		            int t=res.get(j);
		            res.set(j,res.get(j+1));
		            res.set(j+1,t);
		        }
		    }
		}
		for(int i=0;i<res.size();i++){
		    if(arr[rank-1]==res.get(i)){
		        System.out.print(i+1);
		    }
		}
	//	System.out.println(res);
	    
	}
}
