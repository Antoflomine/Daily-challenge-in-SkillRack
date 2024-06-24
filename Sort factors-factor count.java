import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	//	Map<Integer,Integer> map=new HashMap<>();
		ArrayList<Integer> arr=new ArrayList<>();
		ArrayList<Integer>brr=new ArrayList<>();
		for(int i=1;i<=n;i++){
		    if(n%i==0){
		            arr.add(i);
		        }
		   }
		  // System.out.println(arr);
		   for(int i=0;i<arr.size();i++){
		       int c=0;
		       for(int j=1;j<=arr.get(i);j++){
		           if(arr.get(i)%j==0){
		               c++;
		           }
		       }
		       brr.add(c);
		       //System.out.println(c);
		   }
		   
		  for(int i=0;i<brr.size();i++){
		      for(int j=0;j<brr.size()-1;j++){
		      if(brr.get(j)<brr.get(j+1)){
		          int t=brr.get(j);
		          int tp=arr.get(j);
		          brr.set(j,brr.get(j+1));
		          arr.set(j,arr.get(j+1));
		          brr.set(j+1,t);
		          arr.set(j+1,tp);
		      }
		   if(brr.get(j)==brr.get(j+1)){
		       if(arr.get(j)<arr.get(j+1)){
		       int t=arr.get(j);
		       arr.set(j,arr.get(j+1));
		       arr.set(j+1,t);
		       }
		   }
		      }
		  }
		  for(int i=0;i<arr.size();i++){
		  System.out.print(arr.get(i)+" ");
		  }
		  //System.out.println(brr);

	}
}
