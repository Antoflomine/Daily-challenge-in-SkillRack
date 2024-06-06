import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
// 		String[] arr=new String[]
        ArrayList<String[]> list=new ArrayList<String[]>();
        ArrayList<String[]> arr=new ArrayList<>();
		for(int i=0;i<n;i++){
		String str=sc.nextLine();
		 String[] g=str.split(" ");
		 arr.add(g);
		String[] brr=g[1].split(":");
		//System.out.println(Arrays.toString(brr));
		list.add(brr);
		}
		for(int j=0;j<list.size();j++){
		for(int i=0;i<list.size()-1;i++){
		    
		//System.out.println(list.get(i)[0]);
		
		if(Integer.parseInt((list.get(i)[0]))>Integer.parseInt((list.get(i+1)[0]))){
		    String[] t=list.get(i);
		    String[] h=arr.get(i);
		    list.set(i,list.get(i+1));
		    arr.set(i,arr.get(i+1));
		    list.set(i+1,t);
		   arr.set(i+1,h);
		}
		else if(Integer.parseInt(list.get(i)[0])==Integer.parseInt(list.get(i+1)[0])){
		    if(Integer.parseInt(list.get(i)[1])>Integer.parseInt(list.get(i+1)[1])){
		        String[] t=list.get(i);
		       String[] h=arr.get(i);
		        list.set(i,list.get(i+1));
		        arr.set(i,arr.get(i+1));
		        list.set(i+1,t);
		        arr.set(i+1,h);
		    }
		    else if(Integer.parseInt(list.get(i)[1])==Integer.parseInt(list.get(i+1)[1])){
		        if(Integer.parseInt(list.get(i)[2])>Integer.parseInt(list.get(i+1)[2])){
		            String[] t=list.get(i);
		            String[] h=arr.get(i);
		            list.set(i,list.get(i+1));
		            arr.set(i,arr.get(i+1));
		            list.set(i+1,t);
		            arr.set(i+1,h);
		        }
		    }
		}
		}
}
// for(String[] a:list){
//     System.out.println(Arrays.toString(a));
// }
for(String[] u:arr){
    int s=u.length;
    
//System.out.println(Arrays.toString(u));
System.out.print(u[0]+":"+u[2]+" ");
for(int i=3;i<s;i++){
System.out.print(u[i]+" ");
}
System.out.println();
}
	}
}
