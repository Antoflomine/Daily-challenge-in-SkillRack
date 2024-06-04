import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f=sc.nextInt();
		sc.nextLine();
		String[] arr=new String[n];
		ArrayList<String> s=new ArrayList<>();
		ArrayList<Integer> in=new ArrayList<>();
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextLine();
		    String[] y=arr[i].split(" ");
		    s.add(y[0]);
		    in.add(Integer.parseInt(y[1]));
		    
		}
		boolean swap;
		//	System.out.println(Arrays.toString(arr));
	do{
	    swap=false;
		for(int i=1;i<in.size();i++){
		    if(in.get(i-1)<in.get(i)){
		        int t=in.get(i-1);
		        String tp=s.get(i-1);
		        in.set(i-1,in.get(i));
		        s.set(i-1,s.get(i));
		        in.set(i,t);
		        s.set(i,tp);
		        swap=true;
		    }
		}
	}while(swap);
// 	    System.out.println(in);
// 		System.out.println(s);
	  List<String> rankstu=new ArrayList<String>();
	  int[] ranks=new int[in.size()];
	  int cr=1;
	  ranks[0]=cr;
	  rankstu.add(s.get(0));
	  for(int i=1;i<s.size();i++){
	      if(in.get(i)!=in.get(i-1)){
	          cr=i+1;
	      }
	      ranks[i]=cr;
	      rankstu.add(s.get(i));
	  }
	
// 	System.out.println(rankstu);
// 	System.out.println(Arrays.toString(ranks));
    ArrayList<String> res=new ArrayList<>();
    
	for(int i=0;i<ranks.length;i++){
	    if(ranks[i]==f){
	        res.add(rankstu.get(i));
	    }
	}
	Collections.sort(res);
	if(res.size()==0){
	    System.out.println("-1");
	    return;
	}
	else{
	    for(int i=0;i<res.size();i++){
	System.out.println(res.get(i));
	    }
	}
    }
}
