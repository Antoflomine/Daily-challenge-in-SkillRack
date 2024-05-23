import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] arr=new String[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextLine();
		}
	ArrayList<String[]> list=new ArrayList<>();
	for(int i=0;i<n;i++){
		    String[] brr=arr[i].split(" ");
		    list.add(brr);
		    
	}
	ArrayList<String[]> rr=new ArrayList<>();
	String[] res=new String[2];
	int index=0;
	for(int i=0;i<list.size();i++){
	    int f=0;
	  for(int j=0;j<list.size();j++){
	      
	      if(list.get(i)[0].equals(list.get(j)[1])){
	          f=1;
	      }
	  }
	
	  if(f==0){
	     res=list.get(i);
	     index=i;
	     rr.add(list.get(i));
	  }
	    
	}

		 for(int i=0;i<list.size();i++){
		     for(int j=0;j<list.size();j++){
		         if((rr.get(i))[1].equals(list.get(j)[0])){
		             rr.add(list.get(j));
		            // System.out.println(Arrays.toString(list.get(j)));
		             
		         }
		     }
		       
		     }
		 for(int i=0;i<rr.size();i++){
		     System.out.println(rr.get(i)[0]+" to "+rr.get(i)[1]);
		 }
	//	System.out.println(list.toString());
	//	System.out.println(Arrays.toString(res));

	}
}
