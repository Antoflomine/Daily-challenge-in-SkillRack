import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		int y=sc.nextInt();
		int count=0;
		List<Integer> cl=new ArrayList<>();
		for(int i:arr){
		    cl.add(i);
		    
		}
	//	System.out.println(cl);
	List<List<Integer>> c=new ArrayList<>();
    generateCom(cl,x,0,new ArrayList<>(),c);
    for(List<Integer> co:c){
        int sum=0;
        for(int col:co){
            sum+=col;
        }
        if(sum==y){
            count++;
        }
    }
    System.out.println(count);

	}
	public static void generateCom(List<Integer> cl,int x,int start,List<Integer> cur,List<List<Integer>> res){
	    if(cur.size()==x){
	        res.add(new ArrayList<Integer>(cur));
	    }
	    for(int i=start;i<cl.size();i++){
	        cur.add(cl.get(i));
	        generateCom(cl,x,i+1,cur,res);
	        cur.remove(cur.size()-1);
	    }
	}
}
